import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import javassist.ClassPool;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ClassFile;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.Mnemonic;

// https://www.baeldung.com/javassist#loading-bytecode-instructions-of-class

public class TestLoadingByteCode {
    @Test
    public void test() throws NotFoundException, BadBytecode{
        ClassPool cp = ClassPool.getDefault();
        ClassFile cf = cp.get("Point").getClassFile();
        MethodInfo minfo = cf.getMethod("move");
        CodeAttribute ca = minfo.getCodeAttribute();
        CodeIterator ci = ca.iterator();

        List<String> operations = new LinkedList<>();
        while (ci.hasNext()) {
            int index = ci.next();
            int op = ci.byteAt(index);
            operations.add(Mnemonic.OPCODE[op]);
        }

        assertEquals(operations,
                Arrays.asList(
                        "aload_0",
                        "iload_1",
                        "putfield",
                        "aload_0",
                        "iload_2",
                        "putfield",
                        "return"));
    }
}
