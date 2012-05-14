/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TopologyInfo implements org.apache.thrift7.TBase<TopologyInfo, TopologyInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift7.protocol.TStruct STRUCT_DESC = new org.apache.thrift7.protocol.TStruct("TopologyInfo");

  private static final org.apache.thrift7.protocol.TField ID_FIELD_DESC = new org.apache.thrift7.protocol.TField("id", org.apache.thrift7.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift7.protocol.TField NAME_FIELD_DESC = new org.apache.thrift7.protocol.TField("name", org.apache.thrift7.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift7.protocol.TField UPTIME_SECS_FIELD_DESC = new org.apache.thrift7.protocol.TField("uptime_secs", org.apache.thrift7.protocol.TType.I32, (short)3);
  private static final org.apache.thrift7.protocol.TField TASKS_FIELD_DESC = new org.apache.thrift7.protocol.TField("tasks", org.apache.thrift7.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift7.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift7.protocol.TField("status", org.apache.thrift7.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift7.protocol.TField ERRORS_FIELD_DESC = new org.apache.thrift7.protocol.TField("errors", org.apache.thrift7.protocol.TType.MAP, (short)6);

  private String id; // required
  private String name; // required
  private int uptime_secs; // required
  private List<TaskSummary> tasks; // required
  private String status; // required
  private Map<String,List<ErrorInfo>> errors; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift7.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    UPTIME_SECS((short)3, "uptime_secs"),
    TASKS((short)4, "tasks"),
    STATUS((short)5, "status"),
    ERRORS((short)6, "errors");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // UPTIME_SECS
          return UPTIME_SECS;
        case 4: // TASKS
          return TASKS;
        case 5: // STATUS
          return STATUS;
        case 6: // ERRORS
          return ERRORS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __UPTIME_SECS_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift7.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift7.meta_data.FieldMetaData("id", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift7.meta_data.FieldMetaData("name", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPTIME_SECS, new org.apache.thrift7.meta_data.FieldMetaData("uptime_secs", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I32)));
    tmpMap.put(_Fields.TASKS, new org.apache.thrift7.meta_data.FieldMetaData("tasks", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.ListMetaData(org.apache.thrift7.protocol.TType.LIST, 
            new org.apache.thrift7.meta_data.StructMetaData(org.apache.thrift7.protocol.TType.STRUCT, TaskSummary.class))));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift7.meta_data.FieldMetaData("status", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERRORS, new org.apache.thrift7.meta_data.FieldMetaData("errors", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
            new org.apache.thrift7.meta_data.ListMetaData(org.apache.thrift7.protocol.TType.LIST, 
                new org.apache.thrift7.meta_data.StructMetaData(org.apache.thrift7.protocol.TType.STRUCT, ErrorInfo.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift7.meta_data.FieldMetaData.addStructMetaDataMap(TopologyInfo.class, metaDataMap);
  }

  public TopologyInfo() {
  }

  public TopologyInfo(
    String id,
    String name,
    int uptime_secs,
    List<TaskSummary> tasks,
    String status,
    Map<String,List<ErrorInfo>> errors)
  {
    this();
    this.id = id;
    this.name = name;
    this.uptime_secs = uptime_secs;
    set_uptime_secs_isSet(true);
    this.tasks = tasks;
    this.status = status;
    this.errors = errors;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TopologyInfo(TopologyInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.is_set_id()) {
      this.id = other.id;
    }
    if (other.is_set_name()) {
      this.name = other.name;
    }
    this.uptime_secs = other.uptime_secs;
    if (other.is_set_tasks()) {
      List<TaskSummary> __this__tasks = new ArrayList<TaskSummary>();
      for (TaskSummary other_element : other.tasks) {
        __this__tasks.add(new TaskSummary(other_element));
      }
      this.tasks = __this__tasks;
    }
    if (other.is_set_status()) {
      this.status = other.status;
    }
    if (other.is_set_errors()) {
      Map<String,List<ErrorInfo>> __this__errors = new HashMap<String,List<ErrorInfo>>();
      for (Map.Entry<String, List<ErrorInfo>> other_element : other.errors.entrySet()) {

        String other_element_key = other_element.getKey();
        List<ErrorInfo> other_element_value = other_element.getValue();

        String __this__errors_copy_key = other_element_key;

        List<ErrorInfo> __this__errors_copy_value = new ArrayList<ErrorInfo>();
        for (ErrorInfo other_element_value_element : other_element_value) {
          __this__errors_copy_value.add(new ErrorInfo(other_element_value_element));
        }

        __this__errors.put(__this__errors_copy_key, __this__errors_copy_value);
      }
      this.errors = __this__errors;
    }
  }

  public TopologyInfo deepCopy() {
    return new TopologyInfo(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.name = null;
    set_uptime_secs_isSet(false);
    this.uptime_secs = 0;
    this.tasks = null;
    this.status = null;
    this.errors = null;
  }

  public String get_id() {
    return this.id;
  }

  public void set_id(String id) {
    this.id = id;
  }

  public void unset_id() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean is_set_id() {
    return this.id != null;
  }

  public void set_id_isSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public String get_name() {
    return this.name;
  }

  public void set_name(String name) {
    this.name = name;
  }

  public void unset_name() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean is_set_name() {
    return this.name != null;
  }

  public void set_name_isSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int get_uptime_secs() {
    return this.uptime_secs;
  }

  public void set_uptime_secs(int uptime_secs) {
    this.uptime_secs = uptime_secs;
    set_uptime_secs_isSet(true);
  }

  public void unset_uptime_secs() {
    __isset_bit_vector.clear(__UPTIME_SECS_ISSET_ID);
  }

  /** Returns true if field uptime_secs is set (has been assigned a value) and false otherwise */
  public boolean is_set_uptime_secs() {
    return __isset_bit_vector.get(__UPTIME_SECS_ISSET_ID);
  }

  public void set_uptime_secs_isSet(boolean value) {
    __isset_bit_vector.set(__UPTIME_SECS_ISSET_ID, value);
  }

  public int get_tasks_size() {
    return (this.tasks == null) ? 0 : this.tasks.size();
  }

  public java.util.Iterator<TaskSummary> get_tasks_iterator() {
    return (this.tasks == null) ? null : this.tasks.iterator();
  }

  public void add_to_tasks(TaskSummary elem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<TaskSummary>();
    }
    this.tasks.add(elem);
  }

  public List<TaskSummary> get_tasks() {
    return this.tasks;
  }

  public void set_tasks(List<TaskSummary> tasks) {
    this.tasks = tasks;
  }

  public void unset_tasks() {
    this.tasks = null;
  }

  /** Returns true if field tasks is set (has been assigned a value) and false otherwise */
  public boolean is_set_tasks() {
    return this.tasks != null;
  }

  public void set_tasks_isSet(boolean value) {
    if (!value) {
      this.tasks = null;
    }
  }

  public String get_status() {
    return this.status;
  }

  public void set_status(String status) {
    this.status = status;
  }

  public void unset_status() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean is_set_status() {
    return this.status != null;
  }

  public void set_status_isSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int get_errors_size() {
    return (this.errors == null) ? 0 : this.errors.size();
  }

  public void put_to_errors(String key, List<ErrorInfo> val) {
    if (this.errors == null) {
      this.errors = new HashMap<String,List<ErrorInfo>>();
    }
    this.errors.put(key, val);
  }

  public Map<String,List<ErrorInfo>> get_errors() {
    return this.errors;
  }

  public void set_errors(Map<String,List<ErrorInfo>> errors) {
    this.errors = errors;
  }

  public void unset_errors() {
    this.errors = null;
  }

  /** Returns true if field errors is set (has been assigned a value) and false otherwise */
  public boolean is_set_errors() {
    return this.errors != null;
  }

  public void set_errors_isSet(boolean value) {
    if (!value) {
      this.errors = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unset_id();
      } else {
        set_id((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unset_name();
      } else {
        set_name((String)value);
      }
      break;

    case UPTIME_SECS:
      if (value == null) {
        unset_uptime_secs();
      } else {
        set_uptime_secs((Integer)value);
      }
      break;

    case TASKS:
      if (value == null) {
        unset_tasks();
      } else {
        set_tasks((List<TaskSummary>)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unset_status();
      } else {
        set_status((String)value);
      }
      break;

    case ERRORS:
      if (value == null) {
        unset_errors();
      } else {
        set_errors((Map<String,List<ErrorInfo>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return get_id();

    case NAME:
      return get_name();

    case UPTIME_SECS:
      return Integer.valueOf(get_uptime_secs());

    case TASKS:
      return get_tasks();

    case STATUS:
      return get_status();

    case ERRORS:
      return get_errors();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return is_set_id();
    case NAME:
      return is_set_name();
    case UPTIME_SECS:
      return is_set_uptime_secs();
    case TASKS:
      return is_set_tasks();
    case STATUS:
      return is_set_status();
    case ERRORS:
      return is_set_errors();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TopologyInfo)
      return this.equals((TopologyInfo)that);
    return false;
  }

  public boolean equals(TopologyInfo that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.is_set_id();
    boolean that_present_id = true && that.is_set_id();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_name = true && this.is_set_name();
    boolean that_present_name = true && that.is_set_name();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_uptime_secs = true;
    boolean that_present_uptime_secs = true;
    if (this_present_uptime_secs || that_present_uptime_secs) {
      if (!(this_present_uptime_secs && that_present_uptime_secs))
        return false;
      if (this.uptime_secs != that.uptime_secs)
        return false;
    }

    boolean this_present_tasks = true && this.is_set_tasks();
    boolean that_present_tasks = true && that.is_set_tasks();
    if (this_present_tasks || that_present_tasks) {
      if (!(this_present_tasks && that_present_tasks))
        return false;
      if (!this.tasks.equals(that.tasks))
        return false;
    }

    boolean this_present_status = true && this.is_set_status();
    boolean that_present_status = true && that.is_set_status();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_errors = true && this.is_set_errors();
    boolean that_present_errors = true && that.is_set_errors();
    if (this_present_errors || that_present_errors) {
      if (!(this_present_errors && that_present_errors))
        return false;
      if (!this.errors.equals(that.errors))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_id = true && (is_set_id());
    builder.append(present_id);
    if (present_id)
      builder.append(id);

    boolean present_name = true && (is_set_name());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_uptime_secs = true;
    builder.append(present_uptime_secs);
    if (present_uptime_secs)
      builder.append(uptime_secs);

    boolean present_tasks = true && (is_set_tasks());
    builder.append(present_tasks);
    if (present_tasks)
      builder.append(tasks);

    boolean present_status = true && (is_set_status());
    builder.append(present_status);
    if (present_status)
      builder.append(status);

    boolean present_errors = true && (is_set_errors());
    builder.append(present_errors);
    if (present_errors)
      builder.append(errors);

    return builder.toHashCode();
  }

  public int compareTo(TopologyInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TopologyInfo typedOther = (TopologyInfo)other;

    lastComparison = Boolean.valueOf(is_set_id()).compareTo(typedOther.is_set_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_id()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_name()).compareTo(typedOther.is_set_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_name()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_uptime_secs()).compareTo(typedOther.is_set_uptime_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_uptime_secs()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.uptime_secs, typedOther.uptime_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_tasks()).compareTo(typedOther.is_set_tasks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_tasks()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.tasks, typedOther.tasks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_status()).compareTo(typedOther.is_set_status());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_status()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_errors()).compareTo(typedOther.is_set_errors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_errors()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.errors, typedOther.errors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift7.protocol.TProtocol iprot) throws org.apache.thrift7.TException {
    org.apache.thrift7.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift7.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ID
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.id = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NAME
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.name = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // UPTIME_SECS
          if (field.type == org.apache.thrift7.protocol.TType.I32) {
            this.uptime_secs = iprot.readI32();
            set_uptime_secs_isSet(true);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // TASKS
          if (field.type == org.apache.thrift7.protocol.TType.LIST) {
            {
              org.apache.thrift7.protocol.TList _list125 = iprot.readListBegin();
              this.tasks = new ArrayList<TaskSummary>(_list125.size);
              for (int _i126 = 0; _i126 < _list125.size; ++_i126)
              {
                TaskSummary _elem127; // required
                _elem127 = new TaskSummary();
                _elem127.read(iprot);
                this.tasks.add(_elem127);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // STATUS
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.status = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // ERRORS
          if (field.type == org.apache.thrift7.protocol.TType.MAP) {
            {
              org.apache.thrift7.protocol.TMap _map128 = iprot.readMapBegin();
              this.errors = new HashMap<String,List<ErrorInfo>>(2*_map128.size);
              for (int _i129 = 0; _i129 < _map128.size; ++_i129)
              {
                String _key130; // required
                List<ErrorInfo> _val131; // required
                _key130 = iprot.readString();
                {
                  org.apache.thrift7.protocol.TList _list132 = iprot.readListBegin();
                  _val131 = new ArrayList<ErrorInfo>(_list132.size);
                  for (int _i133 = 0; _i133 < _list132.size; ++_i133)
                  {
                    ErrorInfo _elem134; // required
                    _elem134 = new ErrorInfo();
                    _elem134.read(iprot);
                    _val131.add(_elem134);
                  }
                  iprot.readListEnd();
                }
                this.errors.put(_key130, _val131);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift7.protocol.TProtocol oprot) throws org.apache.thrift7.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.id != null) {
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeString(this.id);
      oprot.writeFieldEnd();
    }
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(UPTIME_SECS_FIELD_DESC);
    oprot.writeI32(this.uptime_secs);
    oprot.writeFieldEnd();
    if (this.tasks != null) {
      oprot.writeFieldBegin(TASKS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift7.protocol.TList(org.apache.thrift7.protocol.TType.STRUCT, this.tasks.size()));
        for (TaskSummary _iter135 : this.tasks)
        {
          _iter135.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.status != null) {
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeString(this.status);
      oprot.writeFieldEnd();
    }
    if (this.errors != null) {
      oprot.writeFieldBegin(ERRORS_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.LIST, this.errors.size()));
        for (Map.Entry<String, List<ErrorInfo>> _iter136 : this.errors.entrySet())
        {
          oprot.writeString(_iter136.getKey());
          {
            oprot.writeListBegin(new org.apache.thrift7.protocol.TList(org.apache.thrift7.protocol.TType.STRUCT, _iter136.getValue().size()));
            for (ErrorInfo _iter137 : _iter136.getValue())
            {
              _iter137.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TopologyInfo(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("uptime_secs:");
    sb.append(this.uptime_secs);
    first = false;
    if (!first) sb.append(", ");
    sb.append("tasks:");
    if (this.tasks == null) {
      sb.append("null");
    } else {
      sb.append(this.tasks);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("errors:");
    if (this.errors == null) {
      sb.append("null");
    } else {
      sb.append(this.errors);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift7.TException {
    // check for required fields
    if (!is_set_id()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'id' is unset! Struct:" + toString());
    }

    if (!is_set_name()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'name' is unset! Struct:" + toString());
    }

    if (!is_set_uptime_secs()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'uptime_secs' is unset! Struct:" + toString());
    }

    if (!is_set_tasks()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'tasks' is unset! Struct:" + toString());
    }

    if (!is_set_status()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'status' is unset! Struct:" + toString());
    }

    if (!is_set_errors()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'errors' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

