package opengl.demos.ubuntu;

import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

public class DemoGLX_getProcAddress {
  public static void main(String[] args) {
    ResourceScope scope;
    SegmentAllocator allocator;
    
    scope = ResourceScope.newConfinedScope();
    allocator = SegmentAllocator.ofScope(scope);
    
    MemorySegment glGenFramebuffersName = null;
    MemorySegment glGenFramebuffers = null;
    
   /* if(glGenFramebuffersName==null) {
      glGenFramebuffersName = CLinker.toCString("glGenFramebuffers", scope);  
      
      
      CLinker linker = CLinker.systemCLinker();
      MethodHandle strlen = linker.downcallHandle(
              linker.lookup("strlen").get(),
              FunctionDescriptor.of(JAVA_LONG, ADDRESS)
      );
      
      glGenFramebuffers = (MemorySegment) glx_h.glXGetProcAddress(glGenFramebuffersName);
      
      MemoryHandles
    }
    
    glGenFramebuffers.in
    
    glx_h.glGenFramebuffers(1, frameBuffer);*/

  }
}
