// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$84 {

    static final  GroupLayout GUID_LEGACY_RTC_MITIGATION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_LEGACY_RTC_MITIGATION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_LEGACY_RTC_MITIGATION", constants$84.GUID_LEGACY_RTC_MITIGATION$LAYOUT);
    static final  GroupLayout GUID_ALLOW_SYSTEM_REQUIRED$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ALLOW_SYSTEM_REQUIRED$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ALLOW_SYSTEM_REQUIRED", constants$84.GUID_ALLOW_SYSTEM_REQUIRED$LAYOUT);
    static final  GroupLayout GUID_POWER_SAVING_STATUS$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_POWER_SAVING_STATUS$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_POWER_SAVING_STATUS", constants$84.GUID_POWER_SAVING_STATUS$LAYOUT);
    static final  GroupLayout GUID_ENERGY_SAVER_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ENERGY_SAVER_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ENERGY_SAVER_SUBGROUP", constants$84.GUID_ENERGY_SAVER_SUBGROUP$LAYOUT);
    static final  GroupLayout GUID_ENERGY_SAVER_BATTERY_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ENERGY_SAVER_BATTERY_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ENERGY_SAVER_BATTERY_THRESHOLD", constants$84.GUID_ENERGY_SAVER_BATTERY_THRESHOLD$LAYOUT);
    static final  GroupLayout GUID_ENERGY_SAVER_BRIGHTNESS$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ENERGY_SAVER_BRIGHTNESS$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ENERGY_SAVER_BRIGHTNESS", constants$84.GUID_ENERGY_SAVER_BRIGHTNESS$LAYOUT);
}


