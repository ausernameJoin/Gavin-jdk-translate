// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XComposeStatus extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 8; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XComposeStatus(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XComposeStatus() {
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
	public long get_compose_ptr(int index) { log.finest(""); return Native.getLong(pData+0)+index*Native.getLongSize(); }
	public long get_compose_ptr() { log.finest("");return Native.getLong(pData+0); }
	public void set_compose_ptr(long v) { log.finest(""); Native.putLong(pData + 0, v); }
	public int get_chars_matched() { log.finest("");return (Native.getInt(pData+4)); }
	public void set_chars_matched(int v) { log.finest(""); Native.putInt(pData+4, v); }


	String getName() {
		return "XComposeStatus"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(80);

		ret.append("compose_ptr = ").append( get_compose_ptr() ).append(", ");
		ret.append("chars_matched = ").append( get_chars_matched() ).append(", ");
		return ret.toString();
	}


}



