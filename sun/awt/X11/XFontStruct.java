// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XFontStruct extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 80; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XFontStruct(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XFontStruct() {
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
	public XExtData get_ext_data(int index) { log.finest(""); return (Native.getLong(pData+0) != 0)?(new XExtData(Native.getLong(pData+0)+index*16)):(null); }
	public long get_ext_data() { log.finest("");return Native.getLong(pData+0); }
	public void set_ext_data(long v) { log.finest(""); Native.putLong(pData + 0, v); }
	public long get_fid() { log.finest("");return (Native.getLong(pData+4)); }
	public void set_fid(long v) { log.finest(""); Native.putLong(pData+4, v); }
	public int get_direction() { log.finest("");return (Native.getInt(pData+8)); }
	public void set_direction(int v) { log.finest(""); Native.putInt(pData+8, v); }
	public int get_min_char_or_byte2() { log.finest("");return (Native.getInt(pData+12)); }
	public void set_min_char_or_byte2(int v) { log.finest(""); Native.putInt(pData+12, v); }
	public int get_max_char_or_byte2() { log.finest("");return (Native.getInt(pData+16)); }
	public void set_max_char_or_byte2(int v) { log.finest(""); Native.putInt(pData+16, v); }
	public int get_min_byte1() { log.finest("");return (Native.getInt(pData+20)); }
	public void set_min_byte1(int v) { log.finest(""); Native.putInt(pData+20, v); }
	public int get_max_byte1() { log.finest("");return (Native.getInt(pData+24)); }
	public void set_max_byte1(int v) { log.finest(""); Native.putInt(pData+24, v); }
	public boolean get_all_chars_exist() { log.finest("");return (Native.getBool(pData+28)); }
	public void set_all_chars_exist(boolean v) { log.finest(""); Native.putBool(pData+28, v); }
	public int get_n_properties() { log.finest("");return (Native.getInt(pData+36)); }
	public void set_n_properties(int v) { log.finest(""); Native.putInt(pData+36, v); }
	public XFontProp get_properties(int index) { log.finest(""); return (Native.getLong(pData+40) != 0)?(new XFontProp(Native.getLong(pData+40)+index*8)):(null); }
	public long get_properties() { log.finest("");return Native.getLong(pData+40); }
	public void set_properties(long v) { log.finest(""); Native.putLong(pData + 40, v); }
	public XCharStruct get_min_bounds() { log.finest("");return new XCharStruct(pData + 44); }
	public XCharStruct get_max_bounds() { log.finest("");return new XCharStruct(pData + 56); }
	public XCharStruct get_per_char(int index) { log.finest(""); return (Native.getLong(pData+68) != 0)?(new XCharStruct(Native.getLong(pData+68)+index*12)):(null); }
	public long get_per_char() { log.finest("");return Native.getLong(pData+68); }
	public void set_per_char(long v) { log.finest(""); Native.putLong(pData + 68, v); }
	public int get_ascent() { log.finest("");return (Native.getInt(pData+72)); }
	public void set_ascent(int v) { log.finest(""); Native.putInt(pData+72, v); }
	public int get_descent() { log.finest("");return (Native.getInt(pData+76)); }
	public void set_descent(int v) { log.finest(""); Native.putInt(pData+76, v); }


	String getName() {
		return "XFontStruct"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(600);

		ret.append("ext_data = ").append( get_ext_data() ).append(", ");
		ret.append("fid = ").append( get_fid() ).append(", ");
		ret.append("direction = ").append( get_direction() ).append(", ");
		ret.append("min_char_or_byte2 = ").append( get_min_char_or_byte2() ).append(", ");
		ret.append("max_char_or_byte2 = ").append( get_max_char_or_byte2() ).append(", ");
		ret.append("min_byte1 = ").append( get_min_byte1() ).append(", ");
		ret.append("max_byte1 = ").append( get_max_byte1() ).append(", ");
		ret.append("all_chars_exist = ").append( get_all_chars_exist() ).append(", ");
		ret.append("n_properties = ").append( get_n_properties() ).append(", ");
		ret.append("properties = ").append( get_properties() ).append(", ");
		ret.append("min_bounds = ").append( get_min_bounds() ).append(", ");
		ret.append("max_bounds = ").append( get_max_bounds() ).append(", ");
		ret.append("per_char = ").append( get_per_char() ).append(", ");
		ret.append("ascent = ").append( get_ascent() ).append(", ");
		ret.append("descent = ").append( get_descent() ).append(", ");
		return ret.toString();
	}


}



