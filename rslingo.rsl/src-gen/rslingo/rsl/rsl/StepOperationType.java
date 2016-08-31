/**
 */
package rslingo.rsl.rsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Step Operation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage#getStepOperationType()
 * @model
 * @generated
 */
public enum StepOperationType implements Enumerator
{
  /**
   * The '<em><b>Actor Prepare Data</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACTOR_PREPARE_DATA_VALUE
   * @generated
   * @ordered
   */
  ACTOR_PREPARE_DATA(0, "Actor_PrepareData", "Actor_PrepareData"),

  /**
   * The '<em><b>Actor Call System</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACTOR_CALL_SYSTEM_VALUE
   * @generated
   * @ordered
   */
  ACTOR_CALL_SYSTEM(1, "Actor_CallSystem", "Actor_CallSystem"),

  /**
   * The '<em><b>System Executes</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYSTEM_EXECUTES_VALUE
   * @generated
   * @ordered
   */
  SYSTEM_EXECUTES(2, "System_Executes", "System_Executes"),

  /**
   * The '<em><b>System Return Result</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYSTEM_RETURN_RESULT_VALUE
   * @generated
   * @ordered
   */
  SYSTEM_RETURN_RESULT(3, "System_ReturnResult", "System_ReturnResult"),

  /**
   * The '<em><b>Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OTHER_VALUE
   * @generated
   * @ordered
   */
  OTHER(4, "Other", "Other"),

  /**
   * The '<em><b>None</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(5, "None", "None");

  /**
   * The '<em><b>Actor Prepare Data</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Actor Prepare Data</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACTOR_PREPARE_DATA
   * @model name="Actor_PrepareData"
   * @generated
   * @ordered
   */
  public static final int ACTOR_PREPARE_DATA_VALUE = 0;

  /**
   * The '<em><b>Actor Call System</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Actor Call System</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACTOR_CALL_SYSTEM
   * @model name="Actor_CallSystem"
   * @generated
   * @ordered
   */
  public static final int ACTOR_CALL_SYSTEM_VALUE = 1;

  /**
   * The '<em><b>System Executes</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>System Executes</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYSTEM_EXECUTES
   * @model name="System_Executes"
   * @generated
   * @ordered
   */
  public static final int SYSTEM_EXECUTES_VALUE = 2;

  /**
   * The '<em><b>System Return Result</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>System Return Result</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYSTEM_RETURN_RESULT
   * @model name="System_ReturnResult"
   * @generated
   * @ordered
   */
  public static final int SYSTEM_RETURN_RESULT_VALUE = 3;

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
  public static final int OTHER_VALUE = 4;

  /**
   * The '<em><b>None</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONE
   * @model name="None"
   * @generated
   * @ordered
   */
  public static final int NONE_VALUE = 5;

  /**
   * An array of all the '<em><b>Step Operation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final StepOperationType[] VALUES_ARRAY =
    new StepOperationType[]
    {
      ACTOR_PREPARE_DATA,
      ACTOR_CALL_SYSTEM,
      SYSTEM_EXECUTES,
      SYSTEM_RETURN_RESULT,
      OTHER,
      NONE,
    };

  /**
   * A public read-only list of all the '<em><b>Step Operation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<StepOperationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Step Operation Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StepOperationType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StepOperationType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Step Operation Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StepOperationType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StepOperationType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Step Operation Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StepOperationType get(int value)
  {
    switch (value)
    {
      case ACTOR_PREPARE_DATA_VALUE: return ACTOR_PREPARE_DATA;
      case ACTOR_CALL_SYSTEM_VALUE: return ACTOR_CALL_SYSTEM;
      case SYSTEM_EXECUTES_VALUE: return SYSTEM_EXECUTES;
      case SYSTEM_RETURN_RESULT_VALUE: return SYSTEM_RETURN_RESULT;
      case OTHER_VALUE: return OTHER;
      case NONE_VALUE: return NONE;
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
  private StepOperationType(int value, String name, String literal)
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
  
} //StepOperationType
