/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.research.asynchronousratchetingtree.art.message.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-01-05")
public class SetupMessageStruct implements org.apache.thrift.TBase<SetupMessageStruct, SetupMessageStruct._Fields>, java.io.Serializable, Cloneable, Comparable<SetupMessageStruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SetupMessageStruct");

  private static final org.apache.thrift.protocol.TField LEAF_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("leafNum", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField IDENTITIES_FIELD_DESC = new org.apache.thrift.protocol.TField("identities", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField EPHEMERAL_KEYS_FIELD_DESC = new org.apache.thrift.protocol.TField("ephemeralKeys", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField KEY_EXCHANGE_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("keyExchangeKey", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TREE_FIELD_DESC = new org.apache.thrift.protocol.TField("tree", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SetupMessageStructStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SetupMessageStructTupleSchemeFactory();

  public int leafNum; // required
  public java.util.List<java.lang.String> identities; // required
  public java.util.Map<java.lang.Integer,java.lang.String> ephemeralKeys; // required
  public java.nio.ByteBuffer keyExchangeKey; // required
  public NodeStruct tree; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LEAF_NUM((short)1, "leafNum"),
    IDENTITIES((short)2, "identities"),
    EPHEMERAL_KEYS((short)3, "ephemeralKeys"),
    KEY_EXCHANGE_KEY((short)4, "keyExchangeKey"),
    TREE((short)5, "tree");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LEAF_NUM
          return LEAF_NUM;
        case 2: // IDENTITIES
          return IDENTITIES;
        case 3: // EPHEMERAL_KEYS
          return EPHEMERAL_KEYS;
        case 4: // KEY_EXCHANGE_KEY
          return KEY_EXCHANGE_KEY;
        case 5: // TREE
          return TREE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LEAFNUM_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LEAF_NUM, new org.apache.thrift.meta_data.FieldMetaData("leafNum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IDENTITIES, new org.apache.thrift.meta_data.FieldMetaData("identities", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.EPHEMERAL_KEYS, new org.apache.thrift.meta_data.FieldMetaData("ephemeralKeys", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.KEY_EXCHANGE_KEY, new org.apache.thrift.meta_data.FieldMetaData("keyExchangeKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.TREE, new org.apache.thrift.meta_data.FieldMetaData("tree", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "NodeStruct")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SetupMessageStruct.class, metaDataMap);
  }

  public SetupMessageStruct() {
  }

  public SetupMessageStruct(
    int leafNum,
    java.util.List<java.lang.String> identities,
    java.util.Map<java.lang.Integer,java.lang.String> ephemeralKeys,
    java.nio.ByteBuffer keyExchangeKey,
    NodeStruct tree)
  {
    this();
    this.leafNum = leafNum;
    setLeafNumIsSet(true);
    this.identities = identities;
    this.ephemeralKeys = ephemeralKeys;
    this.keyExchangeKey = org.apache.thrift.TBaseHelper.copyBinary(keyExchangeKey);
    this.tree = tree;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetupMessageStruct(SetupMessageStruct other) {
    __isset_bitfield = other.__isset_bitfield;
    this.leafNum = other.leafNum;
    if (other.isSetIdentities()) {
      java.util.List<java.lang.String> __this__identities = new java.util.ArrayList<java.lang.String>(other.identities);
      this.identities = __this__identities;
    }
    if (other.isSetEphemeralKeys()) {
      java.util.Map<java.lang.Integer,java.lang.String> __this__ephemeralKeys = new java.util.HashMap<java.lang.Integer,java.lang.String>(other.ephemeralKeys);
      this.ephemeralKeys = __this__ephemeralKeys;
    }
    if (other.isSetKeyExchangeKey()) {
      this.keyExchangeKey = org.apache.thrift.TBaseHelper.copyBinary(other.keyExchangeKey);
    }
    if (other.isSetTree()) {
      this.tree = new NodeStruct(other.tree);
    }
  }

  public SetupMessageStruct deepCopy() {
    return new SetupMessageStruct(this);
  }

  @Override
  public void clear() {
    setLeafNumIsSet(false);
    this.leafNum = 0;
    this.identities = null;
    this.ephemeralKeys = null;
    this.keyExchangeKey = null;
    this.tree = null;
  }

  public int getLeafNum() {
    return this.leafNum;
  }

  public SetupMessageStruct setLeafNum(int leafNum) {
    this.leafNum = leafNum;
    setLeafNumIsSet(true);
    return this;
  }

  public void unsetLeafNum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LEAFNUM_ISSET_ID);
  }

  /** Returns true if field leafNum is set (has been assigned a value) and false otherwise */
  public boolean isSetLeafNum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LEAFNUM_ISSET_ID);
  }

  public void setLeafNumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LEAFNUM_ISSET_ID, value);
  }

  public int getIdentitiesSize() {
    return (this.identities == null) ? 0 : this.identities.size();
  }

  public java.util.Iterator<java.lang.String> getIdentitiesIterator() {
    return (this.identities == null) ? null : this.identities.iterator();
  }

  public void addToIdentities(java.lang.String elem) {
    if (this.identities == null) {
      this.identities = new java.util.ArrayList<java.lang.String>();
    }
    this.identities.add(elem);
  }

  public java.util.List<java.lang.String> getIdentities() {
    return this.identities;
  }

  public SetupMessageStruct setIdentities(java.util.List<java.lang.String> identities) {
    this.identities = identities;
    return this;
  }

  public void unsetIdentities() {
    this.identities = null;
  }

  /** Returns true if field identities is set (has been assigned a value) and false otherwise */
  public boolean isSetIdentities() {
    return this.identities != null;
  }

  public void setIdentitiesIsSet(boolean value) {
    if (!value) {
      this.identities = null;
    }
  }

  public int getEphemeralKeysSize() {
    return (this.ephemeralKeys == null) ? 0 : this.ephemeralKeys.size();
  }

  public void putToEphemeralKeys(int key, java.lang.String val) {
    if (this.ephemeralKeys == null) {
      this.ephemeralKeys = new java.util.HashMap<java.lang.Integer,java.lang.String>();
    }
    this.ephemeralKeys.put(key, val);
  }

  public java.util.Map<java.lang.Integer,java.lang.String> getEphemeralKeys() {
    return this.ephemeralKeys;
  }

  public SetupMessageStruct setEphemeralKeys(java.util.Map<java.lang.Integer,java.lang.String> ephemeralKeys) {
    this.ephemeralKeys = ephemeralKeys;
    return this;
  }

  public void unsetEphemeralKeys() {
    this.ephemeralKeys = null;
  }

  /** Returns true if field ephemeralKeys is set (has been assigned a value) and false otherwise */
  public boolean isSetEphemeralKeys() {
    return this.ephemeralKeys != null;
  }

  public void setEphemeralKeysIsSet(boolean value) {
    if (!value) {
      this.ephemeralKeys = null;
    }
  }

  public byte[] getKeyExchangeKey() {
    setKeyExchangeKey(org.apache.thrift.TBaseHelper.rightSize(keyExchangeKey));
    return keyExchangeKey == null ? null : keyExchangeKey.array();
  }

  public java.nio.ByteBuffer bufferForKeyExchangeKey() {
    return org.apache.thrift.TBaseHelper.copyBinary(keyExchangeKey);
  }

  public SetupMessageStruct setKeyExchangeKey(byte[] keyExchangeKey) {
    this.keyExchangeKey = keyExchangeKey == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(keyExchangeKey.clone());
    return this;
  }

  public SetupMessageStruct setKeyExchangeKey(java.nio.ByteBuffer keyExchangeKey) {
    this.keyExchangeKey = org.apache.thrift.TBaseHelper.copyBinary(keyExchangeKey);
    return this;
  }

  public void unsetKeyExchangeKey() {
    this.keyExchangeKey = null;
  }

  /** Returns true if field keyExchangeKey is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyExchangeKey() {
    return this.keyExchangeKey != null;
  }

  public void setKeyExchangeKeyIsSet(boolean value) {
    if (!value) {
      this.keyExchangeKey = null;
    }
  }

  public NodeStruct getTree() {
    return this.tree;
  }

  public SetupMessageStruct setTree(NodeStruct tree) {
    this.tree = tree;
    return this;
  }

  public void unsetTree() {
    this.tree = null;
  }

  /** Returns true if field tree is set (has been assigned a value) and false otherwise */
  public boolean isSetTree() {
    return this.tree != null;
  }

  public void setTreeIsSet(boolean value) {
    if (!value) {
      this.tree = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case LEAF_NUM:
      if (value == null) {
        unsetLeafNum();
      } else {
        setLeafNum((java.lang.Integer)value);
      }
      break;

    case IDENTITIES:
      if (value == null) {
        unsetIdentities();
      } else {
        setIdentities((java.util.List<java.lang.String>)value);
      }
      break;

    case EPHEMERAL_KEYS:
      if (value == null) {
        unsetEphemeralKeys();
      } else {
        setEphemeralKeys((java.util.Map<java.lang.Integer,java.lang.String>)value);
      }
      break;

    case KEY_EXCHANGE_KEY:
      if (value == null) {
        unsetKeyExchangeKey();
      } else {
        if (value instanceof byte[]) {
          setKeyExchangeKey((byte[])value);
        } else {
          setKeyExchangeKey((java.nio.ByteBuffer)value);
        }
      }
      break;

    case TREE:
      if (value == null) {
        unsetTree();
      } else {
        setTree((NodeStruct)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LEAF_NUM:
      return getLeafNum();

    case IDENTITIES:
      return getIdentities();

    case EPHEMERAL_KEYS:
      return getEphemeralKeys();

    case KEY_EXCHANGE_KEY:
      return getKeyExchangeKey();

    case TREE:
      return getTree();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LEAF_NUM:
      return isSetLeafNum();
    case IDENTITIES:
      return isSetIdentities();
    case EPHEMERAL_KEYS:
      return isSetEphemeralKeys();
    case KEY_EXCHANGE_KEY:
      return isSetKeyExchangeKey();
    case TREE:
      return isSetTree();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SetupMessageStruct)
      return this.equals((SetupMessageStruct)that);
    return false;
  }

  public boolean equals(SetupMessageStruct that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_leafNum = true;
    boolean that_present_leafNum = true;
    if (this_present_leafNum || that_present_leafNum) {
      if (!(this_present_leafNum && that_present_leafNum))
        return false;
      if (this.leafNum != that.leafNum)
        return false;
    }

    boolean this_present_identities = true && this.isSetIdentities();
    boolean that_present_identities = true && that.isSetIdentities();
    if (this_present_identities || that_present_identities) {
      if (!(this_present_identities && that_present_identities))
        return false;
      if (!this.identities.equals(that.identities))
        return false;
    }

    boolean this_present_ephemeralKeys = true && this.isSetEphemeralKeys();
    boolean that_present_ephemeralKeys = true && that.isSetEphemeralKeys();
    if (this_present_ephemeralKeys || that_present_ephemeralKeys) {
      if (!(this_present_ephemeralKeys && that_present_ephemeralKeys))
        return false;
      if (!this.ephemeralKeys.equals(that.ephemeralKeys))
        return false;
    }

    boolean this_present_keyExchangeKey = true && this.isSetKeyExchangeKey();
    boolean that_present_keyExchangeKey = true && that.isSetKeyExchangeKey();
    if (this_present_keyExchangeKey || that_present_keyExchangeKey) {
      if (!(this_present_keyExchangeKey && that_present_keyExchangeKey))
        return false;
      if (!this.keyExchangeKey.equals(that.keyExchangeKey))
        return false;
    }

    boolean this_present_tree = true && this.isSetTree();
    boolean that_present_tree = true && that.isSetTree();
    if (this_present_tree || that_present_tree) {
      if (!(this_present_tree && that_present_tree))
        return false;
      if (!this.tree.equals(that.tree))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + leafNum;

    hashCode = hashCode * 8191 + ((isSetIdentities()) ? 131071 : 524287);
    if (isSetIdentities())
      hashCode = hashCode * 8191 + identities.hashCode();

    hashCode = hashCode * 8191 + ((isSetEphemeralKeys()) ? 131071 : 524287);
    if (isSetEphemeralKeys())
      hashCode = hashCode * 8191 + ephemeralKeys.hashCode();

    hashCode = hashCode * 8191 + ((isSetKeyExchangeKey()) ? 131071 : 524287);
    if (isSetKeyExchangeKey())
      hashCode = hashCode * 8191 + keyExchangeKey.hashCode();

    hashCode = hashCode * 8191 + ((isSetTree()) ? 131071 : 524287);
    if (isSetTree())
      hashCode = hashCode * 8191 + tree.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SetupMessageStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetLeafNum()).compareTo(other.isSetLeafNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeafNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.leafNum, other.leafNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIdentities()).compareTo(other.isSetIdentities());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdentities()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.identities, other.identities);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEphemeralKeys()).compareTo(other.isSetEphemeralKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEphemeralKeys()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ephemeralKeys, other.ephemeralKeys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetKeyExchangeKey()).compareTo(other.isSetKeyExchangeKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyExchangeKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyExchangeKey, other.keyExchangeKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTree()).compareTo(other.isSetTree());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTree()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tree, other.tree);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SetupMessageStruct(");
    boolean first = true;

    sb.append("leafNum:");
    sb.append(this.leafNum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("identities:");
    if (this.identities == null) {
      sb.append("null");
    } else {
      sb.append(this.identities);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ephemeralKeys:");
    if (this.ephemeralKeys == null) {
      sb.append("null");
    } else {
      sb.append(this.ephemeralKeys);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("keyExchangeKey:");
    if (this.keyExchangeKey == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.keyExchangeKey, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tree:");
    if (this.tree == null) {
      sb.append("null");
    } else {
      sb.append(this.tree);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SetupMessageStructStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SetupMessageStructStandardScheme getScheme() {
      return new SetupMessageStructStandardScheme();
    }
  }

  private static class SetupMessageStructStandardScheme extends org.apache.thrift.scheme.StandardScheme<SetupMessageStruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SetupMessageStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LEAF_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.leafNum = iprot.readI32();
              struct.setLeafNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IDENTITIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.identities = new java.util.ArrayList<java.lang.String>(_list0.size);
                java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.identities.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setIdentitiesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EPHEMERAL_KEYS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map3 = iprot.readMapBegin();
                struct.ephemeralKeys = new java.util.HashMap<java.lang.Integer,java.lang.String>(2*_map3.size);
                int _key4;
                java.lang.String _val5;
                for (int _i6 = 0; _i6 < _map3.size; ++_i6)
                {
                  _key4 = iprot.readI32();
                  _val5 = iprot.readString();
                  struct.ephemeralKeys.put(_key4, _val5);
                }
                iprot.readMapEnd();
              }
              struct.setEphemeralKeysIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // KEY_EXCHANGE_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.keyExchangeKey = iprot.readBinary();
              struct.setKeyExchangeKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TREE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.tree = new NodeStruct();
              struct.tree.read(iprot);
              struct.setTreeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SetupMessageStruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LEAF_NUM_FIELD_DESC);
      oprot.writeI32(struct.leafNum);
      oprot.writeFieldEnd();
      if (struct.identities != null) {
        oprot.writeFieldBegin(IDENTITIES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.identities.size()));
          for (java.lang.String _iter7 : struct.identities)
          {
            oprot.writeString(_iter7);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.ephemeralKeys != null) {
        oprot.writeFieldBegin(EPHEMERAL_KEYS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, struct.ephemeralKeys.size()));
          for (java.util.Map.Entry<java.lang.Integer, java.lang.String> _iter8 : struct.ephemeralKeys.entrySet())
          {
            oprot.writeI32(_iter8.getKey());
            oprot.writeString(_iter8.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.keyExchangeKey != null) {
        oprot.writeFieldBegin(KEY_EXCHANGE_KEY_FIELD_DESC);
        oprot.writeBinary(struct.keyExchangeKey);
        oprot.writeFieldEnd();
      }
      if (struct.tree != null) {
        oprot.writeFieldBegin(TREE_FIELD_DESC);
        struct.tree.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetupMessageStructTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SetupMessageStructTupleScheme getScheme() {
      return new SetupMessageStructTupleScheme();
    }
  }

  private static class SetupMessageStructTupleScheme extends org.apache.thrift.scheme.TupleScheme<SetupMessageStruct> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SetupMessageStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLeafNum()) {
        optionals.set(0);
      }
      if (struct.isSetIdentities()) {
        optionals.set(1);
      }
      if (struct.isSetEphemeralKeys()) {
        optionals.set(2);
      }
      if (struct.isSetKeyExchangeKey()) {
        optionals.set(3);
      }
      if (struct.isSetTree()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetLeafNum()) {
        oprot.writeI32(struct.leafNum);
      }
      if (struct.isSetIdentities()) {
        {
          oprot.writeI32(struct.identities.size());
          for (java.lang.String _iter9 : struct.identities)
          {
            oprot.writeString(_iter9);
          }
        }
      }
      if (struct.isSetEphemeralKeys()) {
        {
          oprot.writeI32(struct.ephemeralKeys.size());
          for (java.util.Map.Entry<java.lang.Integer, java.lang.String> _iter10 : struct.ephemeralKeys.entrySet())
          {
            oprot.writeI32(_iter10.getKey());
            oprot.writeString(_iter10.getValue());
          }
        }
      }
      if (struct.isSetKeyExchangeKey()) {
        oprot.writeBinary(struct.keyExchangeKey);
      }
      if (struct.isSetTree()) {
        struct.tree.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SetupMessageStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.leafNum = iprot.readI32();
        struct.setLeafNumIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list11 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.identities = new java.util.ArrayList<java.lang.String>(_list11.size);
          java.lang.String _elem12;
          for (int _i13 = 0; _i13 < _list11.size; ++_i13)
          {
            _elem12 = iprot.readString();
            struct.identities.add(_elem12);
          }
        }
        struct.setIdentitiesIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map14 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.ephemeralKeys = new java.util.HashMap<java.lang.Integer,java.lang.String>(2*_map14.size);
          int _key15;
          java.lang.String _val16;
          for (int _i17 = 0; _i17 < _map14.size; ++_i17)
          {
            _key15 = iprot.readI32();
            _val16 = iprot.readString();
            struct.ephemeralKeys.put(_key15, _val16);
          }
        }
        struct.setEphemeralKeysIsSet(true);
      }
      if (incoming.get(3)) {
        struct.keyExchangeKey = iprot.readBinary();
        struct.setKeyExchangeKeyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.tree = new NodeStruct();
        struct.tree.read(iprot);
        struct.setTreeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

