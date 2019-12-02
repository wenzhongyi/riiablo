// automatically generated by the FlatBuffers compiler, do not modify

package com.riiablo.net.packet.bncs;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class ChatEvent extends Table {
  public static ChatEvent getRootAsChatEvent(ByteBuffer _bb) { return getRootAsChatEvent(_bb, new ChatEvent()); }
  public static ChatEvent getRootAsChatEvent(ByteBuffer _bb, ChatEvent obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public ChatEvent __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte eid() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 19; }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public String text() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer textAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer textInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }

  public static int createChatEvent(FlatBufferBuilder builder,
      byte eid,
      int nameOffset,
      int textOffset) {
    builder.startObject(3);
    ChatEvent.addText(builder, textOffset);
    ChatEvent.addName(builder, nameOffset);
    ChatEvent.addEid(builder, eid);
    return ChatEvent.endChatEvent(builder);
  }

  public static void startChatEvent(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addEid(FlatBufferBuilder builder, byte eid) { builder.addByte(0, eid, 19); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addText(FlatBufferBuilder builder, int textOffset) { builder.addOffset(2, textOffset, 0); }
  public static int endChatEvent(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

