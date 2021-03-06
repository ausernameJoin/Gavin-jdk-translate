// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XkbExtensionDeviceNotifyEvent extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 64; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XkbExtensionDeviceNotifyEvent(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XkbExtensionDeviceNotifyEvent() {
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
	public long get_serial() { log.finest("");return (Native.getULong(pData+4)); }
	public void set_serial(long v) { log.finest(""); Native.putULong(pData+4, v); }
	public boolean get_send_event() { log.finest("");return (Native.getBool(pData+8)); }
	public void set_send_event(boolean v) { log.finest(""); Native.putBool(pData+8, v); }
	public long get_display() { log.finest("");return (Native.getLong(pData+12)); }
	public void set_display(long v) { log.finest(""); Native.putLong(pData+12, v); }
	public long get_time() { log.finest("");return (Native.getULong(pData+16)); }
	public void set_time(long v) { log.finest(""); Native.putULong(pData+16, v); }
	public int get_xkb_type() { log.finest("");return (Native.getInt(pData+20)); }
	public void set_xkb_type(int v) { log.finest(""); Native.putInt(pData+20, v); }
	public int get_device() { log.finest("");return (Native.getInt(pData+24)); }
	public void set_device(int v) { log.finest(""); Native.putInt(pData+24, v); }
	public int get_reason() { log.finest("");return (Native.getInt(pData+28)); }
	public void set_reason(int v) { log.finest(""); Native.putInt(pData+28, v); }
	public int get_supported() { log.finest("");return (Native.getInt(pData+32)); }
	public void set_supported(int v) { log.finest(""); Native.putInt(pData+32, v); }
	public int get_unsupported() { log.finest("");return (Native.getInt(pData+36)); }
	public void set_unsupported(int v) { log.finest(""); Native.putInt(pData+36, v); }
	public int get_first_btn() { log.finest("");return (Native.getInt(pData+40)); }
	public void set_first_btn(int v) { log.finest(""); Native.putInt(pData+40, v); }
	public int get_num_btns() { log.finest("");return (Native.getInt(pData+44)); }
	public void set_num_btns(int v) { log.finest(""); Native.putInt(pData+44, v); }
	public int get_leds_defined() { log.finest("");return (Native.getInt(pData+48)); }
	public void set_leds_defined(int v) { log.finest(""); Native.putInt(pData+48, v); }
	public int get_led_state() { log.finest("");return (Native.getInt(pData+52)); }
	public void set_led_state(int v) { log.finest(""); Native.putInt(pData+52, v); }
	public int get_led_class() { log.finest("");return (Native.getInt(pData+56)); }
	public void set_led_class(int v) { log.finest(""); Native.putInt(pData+56, v); }
	public int get_led_id() { log.finest("");return (Native.getInt(pData+60)); }
	public void set_led_id(int v) { log.finest(""); Native.putInt(pData+60, v); }


	String getName() {
		return "XkbExtensionDeviceNotifyEvent"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(640);

		ret.append("type = ").append( XlibWrapper.eventToString[get_type()] ).append(", ");
		ret.append("serial = ").append( get_serial() ).append(", ");
		ret.append("send_event = ").append( get_send_event() ).append(", ");
		ret.append("display = ").append( get_display() ).append(", ");
		ret.append("time = ").append( get_time() ).append(", ");
		ret.append("xkb_type = ").append( get_xkb_type() ).append(", ");
		ret.append("device = ").append( get_device() ).append(", ");
		ret.append("reason = ").append( get_reason() ).append(", ");
		ret.append("supported = ").append( get_supported() ).append(", ");
		ret.append("unsupported = ").append( get_unsupported() ).append(", ");
		ret.append("first_btn = ").append( get_first_btn() ).append(", ");
		ret.append("num_btns = ").append( get_num_btns() ).append(", ");
		ret.append("leds_defined = ").append( get_leds_defined() ).append(", ");
		ret.append("led_state = ").append( get_led_state() ).append(", ");
		ret.append("led_class = ").append( get_led_class() ).append(", ");
		ret.append("led_id = ").append( get_led_id() ).append(", ");
		return ret.toString();
	}


}



