import javassist.bytecode.ClassFile;
import javassist.bytecode.DuplicateMemberException;
import javassist.bytecode.FieldInfo;
import javassist.bytecode.AccessFlag;
import javassist.CannotCompileException;
import javassist.ClassPool;
import java.lang.reflect.Field;

/**
 * https://www.baeldung.com/javassist
 * http://www.javassist.org/html/index.html
 */
public class JavassistGen {
    public static void main(String[] args) throws SecurityException, CannotCompileException, RuntimeException{
        ClassFile cf = new ClassFile(
                false, "com.baeldung.JavassistGeneratedClass", null);
        cf.setInterfaces(new String[] {"java.lang.Cloneable"});

        FieldInfo f = new FieldInfo(cf.getConstPool(), "id", "I");
        f.setAccessFlags(AccessFlag.PUBLIC);
        cf.addField(f);

        ClassPool classPool = ClassPool.getDefault();
        Field[] fields = classPool.makeClass(cf).toClass().getFields();


        System.out.println(classPool);

        //assertEquals(fields[0].getName(), "id");
    }
}
