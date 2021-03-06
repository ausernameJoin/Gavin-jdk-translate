// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XIMHotKeyTrigger extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 12; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XIMHotKeyTrigger(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XIMHotKeyTrigger() {
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
	public long get_keysym() { log.finest("");return (Native.getLong(pData+0)); }
	public void set_keysym(long v) { log.finest(""); Native.putLong(pData+0, v); }
	public int get_modifier() { log.finest("");return (Native.getInt(pData+4)); }
	public void set_modifier(int v) { log.finest(""); Native.putInt(pData+4, v); }
	public int get_modifier_mask() { log.finest("");return (Native.getInt(pData+8)); }
	public void set_modifier_mask(int v) { log.finest(""); Native.putInt(pData+8, v); }


	String getName() {
		return "XIMHotKeyTrigger"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(120);

		ret.append("keysym = ").append( get_keysym() ).append(", ");
		ret.append("modifier = ").append( get_modifier() ).append(", ");
		ret.append("modifier_mask = ").append( get_modifier_mask() ).append(", ");
		return ret.toString();
	}


}



