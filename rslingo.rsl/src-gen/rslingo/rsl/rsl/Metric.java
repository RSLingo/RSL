/**
 */
package rslingo.rsl.rsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage#getMetric()
 * @model
 * @generated
 */
public enum Metric implements Enumerator
{
  /**
   * The '<em><b>Time Day</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_DAY_VALUE
   * @generated
   * @ordered
   */
  TIME_DAY(0, "Time_Day", "Time_Day"),

  /**
   * The '<em><b>Time Hour</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_HOUR_VALUE
   * @generated
   * @ordered
   */
  TIME_HOUR(1, "Time_Hour", "Time_Hour"),

  /**
   * The '<em><b>Time Min</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_MIN_VALUE
   * @generated
   * @ordered
   */
  TIME_MIN(2, "Time_Min", "Time_Min"),

  /**
   * The '<em><b>Time Sec</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_SEC_VALUE
   * @generated
   * @ordered
   */
  TIME_SEC(3, "Time_Sec", "Time_Sec"),

  /**
   * The '<em><b>Time mSec</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_MSEC_VALUE
   * @generated
   * @ordered
   */
  TIME_MSEC(4, "Time_mSec", "Time_mSec"),

  /**
   * The '<em><b>Frequency Hz</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FREQUENCY_HZ_VALUE
   * @generated
   * @ordered
   */
  FREQUENCY_HZ(5, "Frequency_Hz", "Frequency_Hz"),

  /**
   * The '<em><b>Frequency KHz</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FREQUENCY_KHZ_VALUE
   * @generated
   * @ordered
   */
  FREQUENCY_KHZ(6, "Frequency_KHz", "Frequency_KHz"),

  /**
   * The '<em><b>Frequency MHz</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FREQUENCY_MHZ_VALUE
   * @generated
   * @ordered
   */
  FREQUENCY_MHZ(7, "Frequency_MHz", "Frequency_MHz"),

  /**
   * The '<em><b>Capacity KByte</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CAPACITY_KBYTE_VALUE
   * @generated
   * @ordered
   */
  CAPACITY_KBYTE(8, "Capacity_KByte", "Capacity_KByte"),

  /**
   * The '<em><b>Capacity MByte</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CAPACITY_MBYTE_VALUE
   * @generated
   * @ordered
   */
  CAPACITY_MBYTE(9, "Capacity_MByte", "Capacity_MByte"),

  /**
   * The '<em><b>Capacity GByte</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CAPACITY_GBYTE_VALUE
   * @generated
   * @ordered
   */
  CAPACITY_GBYTE(10, "Capacity_GByte", "Capacity_GByte"),

  /**
   * The '<em><b>Capacity TByte</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CAPACITY_TBYTE_VALUE
   * @generated
   * @ordered
   */
  CAPACITY_TBYTE(11, "Capacity_TByte", "Capacity_TByte"),

  /**
   * The '<em><b>Task</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TASK_VALUE
   * @generated
   * @ordered
   */
  TASK(12, "Task", "Task"),

  /**
   * The '<em><b>Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OTHER_VALUE
   * @generated
   * @ordered
   */
  OTHER(13, "Other", "Other");

  /**
   * The '<em><b>Time Day</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time Day</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME_DAY
   * @model name="Time_Day"
   * @generated
   * @ordered
   */
  public static final int TIME_DAY_VALUE = 0;

  /**
   * The '<em><b>Time Hour</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time Hour</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME_HOUR
   * @model name="Time_Hour"
   * @generated
   * @ordered
   */
  public static final int TIME_HOUR_VALUE = 1;

  /**
   * The '<em><b>Time Min</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time Min</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME_MIN
   * @model name="Time_Min"
   * @generated
   * @ordered
   */
  public static final int TIME_MIN_VALUE = 2;

  /**
   * The '<em><b>Time Sec</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time Sec</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME_SEC
   * @model name="Time_Sec"
   * @generated
   * @ordered
   */
  public static final int TIME_SEC_VALUE = 3;

  /**
   * The '<em><b>Time mSec</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time mSec</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME_MSEC
   * @model name="Time_mSec"
   * @generated
   * @ordered
   */
  public static final int TIME_MSEC_VALUE = 4;

  /**
   * The '<em><b>Frequency Hz</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Frequency Hz</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FREQUENCY_HZ
   * @model name="Frequency_Hz"
   * @generated
   * @ordered
   */
  public static final int FREQUENCY_HZ_VALUE = 5;

  /**
   * The '<em><b>Frequency KHz</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Frequency KHz</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FREQUENCY_KHZ
   * @model name="Frequency_KHz"
   * @generated
   * @ordered
   */
  public static final int FREQUENCY_KHZ_VALUE = 6;

  /**
   * The '<em><b>Frequency MHz</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Frequency MHz</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FREQUENCY_MHZ
   * @model name="Frequency_MHz"
   * @generated
   * @ordered
   */
  public static final int FREQUENCY_MHZ_VALUE = 7;

  /**
   * The '<em><b>Capacity KByte</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Capacity KByte</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CAPACITY_KBYTE
   * @model name="Capacity_KByte"
   * @generated
   * @ordered
   */
  public static final int CAPACITY_KBYTE_VALUE = 8;

  /**
   * The '<em><b>Capacity MByte</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Capacity MByte</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CAPACITY_MBYTE
   * @model name="Capacity_MByte"
   * @generated
   * @ordered
   */
  public static final int CAPACITY_MBYTE_VALUE = 9;

  /**
   * The '<em><b>Capacity GByte</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Capacity GByte</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CAPACITY_GBYTE
   * @model name="Capacity_GByte"
   * @generated
   * @ordered
   */
  public static final int CAPACITY_GBYTE_VALUE = 10;

  /**
   * The '<em><b>Capacity TByte</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Capacity TByte</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CAPACITY_TBYTE
   * @model name="Capacity_TByte"
   * @generated
   * @ordered
   */
  public static final int CAPACITY_TBYTE_VALUE = 11;

  /**
   * The '<em><b>Task</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Task</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TASK
   * @model name="Task"
   * @generated
   * @ordered
   */
  public static final int TASK_VALUE = 12;

  /**
   * The '<em><b>Other</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OTHER
   * @model name="Other"
   * @generated
   * @ordered
   */
  public static final int OTHER_VALUE = 13;

  /**
   * An array of all the '<em><b>Metric</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Metric[] VALUES_ARRAY =
    new Metric[]
    {
      TIME_DAY,
      TIME_HOUR,
      TIME_MIN,
      TIME_SEC,
      TIME_MSEC,
      FREQUENCY_HZ,
      FREQUENCY_KHZ,
      FREQUENCY_MHZ,
      CAPACITY_KBYTE,
      CAPACITY_MBYTE,
      CAPACITY_GBYTE,
      CAPACITY_TBYTE,
      TASK,
      OTHER,
    };

  /**
   * A public read-only list of all the '<em><b>Metric</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Metric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Metric</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Metric get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Metric result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Metric</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Metric getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Metric result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Metric</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Metric get(int value)
  {
    switch (value)
    {
      case TIME_DAY_VALUE: return TIME_DAY;
      case TIME_HOUR_VALUE: return TIME_HOUR;
      case TIME_MIN_VALUE: return TIME_MIN;
      case TIME_SEC_VALUE: return TIME_SEC;
      case TIME_MSEC_VALUE: return TIME_MSEC;
      case FREQUENCY_HZ_VALUE: return FREQUENCY_HZ;
      case FREQUENCY_KHZ_VALUE: return FREQUENCY_KHZ;
      case FREQUENCY_MHZ_VALUE: return FREQUENCY_MHZ;
      case CAPACITY_KBYTE_VALUE: return CAPACITY_KBYTE;
      case CAPACITY_MBYTE_VALUE: return CAPACITY_MBYTE;
      case CAPACITY_GBYTE_VALUE: return CAPACITY_GBYTE;
      case CAPACITY_TBYTE_VALUE: return CAPACITY_TBYTE;
      case TASK_VALUE: return TASK;
      case OTHER_VALUE: return OTHER;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Metric(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Metric
