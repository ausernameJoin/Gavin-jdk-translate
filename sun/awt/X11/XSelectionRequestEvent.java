// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XSelectionRequestEvent extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 40; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XSelectionRequestEvent(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XSelectionRequestEvent() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public int get_type() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_type(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public long get_serial() { log.finest("");return (Native.getLong(pData+4)); }
	public void set_serial(long v) { log.finest(""); Native.putLong(pData+4, v); }
	public boolean get_send_event() { log.finest("");return (Native.getBool(pData+8)); }
	public void set_send_event(boolean v) { log.finest(""); Native.putBool(pData+8, v); }
	public long get_display() { log.finest("");return (Native.getLong(pData+12)); }
	public void set_display(long v) { log.finest(""); Native.putLong(pData+12, v); }
	public long get_owner() { log.finest("");return (Native.getLong(pData+16)); }
	public void set_owner(long v) { log.finest(""); Native.putLong(pData+16, v); }
	public long get_requestor() { log.finest("");return (Native.getLong(pData+20)); }
	public void set_requestor(long v) { log.finest(""); Native.putLong(pData+20, v); }
	public long get_selection() { log.finest("");return (Native.getLong(pData+24)); }
	public void set_selection(long v) { log.finest(""); Native.putLong(pData+24, v); }
	public long get_target() { log.finest("");return (Native.getLong(pData+28)); }
	public void set_target(long v) { log.finest(""); Native.putLong(pData+28, v); }
	public long get_property() { log.finest("");return (Native.getLong(pData+32)); }
	public void set_property(long v) { log.finest(""); Native.putLong(pData+32, v); }
	public long get_time() { log.finest("");return (Native.getULong(pData+36)); }
	public void set_time(long v) { log.finest(""); Native.putULong(pData+36, v); }


	String getName() {
		return "XSelectionRequestEvent"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(400);

		ret.append("type = ").append( XlibWrapper.eventToString[get_type()] ).append(", ");
		ret.append("serial = ").append( get_serial() ).append(", ");
		ret.append("send_event = ").append( get_send_event() ).append(", ");
		ret.append("display = ").append( get_display() ).append(", ");
		ret.append("owner = ").append( get_owner() ).append(", ");
		ret.append("requestor = ").append( get_requestor() ).append(", ");
		ret.append("selection = " ).append( XAtom.get(get_selection()) ).append(", ");
		ret.append("target = " ).append( XAtom.get(get_target()) ).append(", ");
		ret.append("property = " ).append( XAtom.get(get_property()) ).append(", ");
		ret.append("time = ").append( get_time() ).append(", ");
		return ret.toString();
	}


}



