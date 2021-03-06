// automatically generated by the FlatBuffers compiler, do not modify

package com.riiablo.net.packet.d2gs;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Disconnect extends Table {
  public static Disconnect getRootAsDisconnect(ByteBuffer _bb) { return getRootAsDisconnect(_bb, new Disconnect()); }
  public static Disconnect getRootAsDisconnect(ByteBuffer _bb, Disconnect obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Disconnect __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int entityId() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createDisconnect(FlatBufferBuilder builder,
      int entityId) {
    builder.startObject(1);
    Disconnect.addEntityId(builder, entityId);
    return Disconnect.endDisconnect(builder);
  }

  public static void startDisconnect(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addEntityId(FlatBufferBuilder builder, int entityId) { builder.addInt(0, entityId, 0); }
  public static int endDisconnect(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

