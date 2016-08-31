/**
 */
package rslingo.rsl.rsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Step Operation Sub Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage#getStepOperationSubType()
 * @model
 * @generated
 */
public enum StepOperationSubType implements Enumerator
{
  /**
   * The '<em><b>Submit Data</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUBMIT_DATA_VALUE
   * @generated
   * @ordered
   */
  SUBMIT_DATA(0, "SubmitData", "SubmitData"),

  /**
   * The '<em><b>Show Data</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SHOW_DATA_VALUE
   * @generated
   * @ordered
   */
  SHOW_DATA(1, "ShowData", "ShowData"),

  /**
   * The '<em><b>Cancel Use Case</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CANCEL_USE_CASE_VALUE
   * @generated
   * @ordered
   */
  CANCEL_USE_CASE(2, "CancelUseCase", "CancelUseCase"),

  /**
   * The '<em><b>Terminate Use Case</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TERMINATE_USE_CASE_VALUE
   * @generated
   * @ordered
   */
  TERMINATE_USE_CASE(3, "TerminateUseCase", "TerminateUseCase"),

  /**
   * The '<em><b>Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OTHER_VALUE
   * @generated
   * @ordered
   */
  OTHER(4, "Other", "Other");

  /**
   * The '<em><b>Submit Data</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Submit Data</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUBMIT_DATA
   * @model name="SubmitData"
   * @generated
   * @ordered
   */
  public static final int SUBMIT_DATA_VALUE = 0;

  /**
   * The '<em><b>Show Data</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Show Data</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SHOW_DATA
   * @model name="ShowData"
   * @generated
   * @ordered
   */
  public static final int SHOW_DATA_VALUE = 1;

  /**
   * The '<em><b>Cancel Use Case</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cancel Use Case</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CANCEL_USE_CASE
   * @model name="CancelUseCase"
   * @generated
   * @ordered
   */
  public static final int CANCEL_USE_CASE_VALUE = 2;

  /**
   * The '<em><b>Terminate Use Case</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Terminate Use Case</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TERMINATE_USE_CASE
   * @model name="TerminateUseCase"
   * @generated
   * @ordered
   */
  public static final int TERMINATE_USE_CASE_VALUE = 3;

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
   * An array of all the '<em><b>Step Operation Sub Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final StepOperationSubType[] VALUES_ARRAY =
    new StepOperationSubType[]
    {
      SUBMIT_DATA,
      SHOW_DATA,
      CANCEL_USE_CASE,
      TERMINATE_USE_CASE,
      OTHER,
    };

  /**
   * A public read-only list of all the '<em><b>Step Operation Sub Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<StepOperationSubType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Step Operation Sub Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StepOperationSubType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StepOperationSubType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Step Operation Sub Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StepOperationSubType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StepOperationSubType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Step Operation Sub Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StepOperationSubType get(int value)
  {
    switch (value)
    {
      case SUBMIT_DATA_VALUE: return SUBMIT_DATA;
      case SHOW_DATA_VALUE: return SHOW_DATA;
      case CANCEL_USE_CASE_VALUE: return CANCEL_USE_CASE;
      case TERMINATE_USE_CASE_VALUE: return TERMINATE_USE_CASE;
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
  private StepOperationSubType(int value, String name, String literal)
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
  
} //StepOperationSubType
