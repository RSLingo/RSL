/**
 */
package rslingo.rsl.rsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage#getConstraintType()
 * @model
 * @generated
 */
public enum ConstraintType implements Enumerator
{
  /**
   * The '<em><b>Cultural</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CULTURAL_VALUE
   * @generated
   * @ordered
   */
  CULTURAL(0, "Cultural", "Cultural"),

  /**
   * The '<em><b>Legal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEGAL_VALUE
   * @generated
   * @ordered
   */
  LEGAL(1, "Legal", "Legal"),

  /**
   * The '<em><b>Organizational</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ORGANIZATIONAL_VALUE
   * @generated
   * @ordered
   */
  ORGANIZATIONAL(2, "Organizational", "Organizational"),

  /**
   * The '<em><b>Project</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROJECT_VALUE
   * @generated
   * @ordered
   */
  PROJECT(3, "Project", "Project"),

  /**
   * The '<em><b>Technological</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TECHNOLOGICAL_VALUE
   * @generated
   * @ordered
   */
  TECHNOLOGICAL(4, "Technological", "Technological"),

  /**
   * The '<em><b>Physical</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PHYSICAL_VALUE
   * @generated
   * @ordered
   */
  PHYSICAL(5, "Physical", "Physical"),

  /**
   * The '<em><b>Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OTHER_VALUE
   * @generated
   * @ordered
   */
  OTHER(6, "Other", "Other");

  /**
   * The '<em><b>Cultural</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cultural</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CULTURAL
   * @model name="Cultural"
   * @generated
   * @ordered
   */
  public static final int CULTURAL_VALUE = 0;

  /**
   * The '<em><b>Legal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Legal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LEGAL
   * @model name="Legal"
   * @generated
   * @ordered
   */
  public static final int LEGAL_VALUE = 1;

  /**
   * The '<em><b>Organizational</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Organizational</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ORGANIZATIONAL
   * @model name="Organizational"
   * @generated
   * @ordered
   */
  public static final int ORGANIZATIONAL_VALUE = 2;

  /**
   * The '<em><b>Project</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Project</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROJECT
   * @model name="Project"
   * @generated
   * @ordered
   */
  public static final int PROJECT_VALUE = 3;

  /**
   * The '<em><b>Technological</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Technological</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TECHNOLOGICAL
   * @model name="Technological"
   * @generated
   * @ordered
   */
  public static final int TECHNOLOGICAL_VALUE = 4;

  /**
   * The '<em><b>Physical</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Physical</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PHYSICAL
   * @model name="Physical"
   * @generated
   * @ordered
   */
  public static final int PHYSICAL_VALUE = 5;

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
  public static final int OTHER_VALUE = 6;

  /**
   * An array of all the '<em><b>Constraint Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ConstraintType[] VALUES_ARRAY =
    new ConstraintType[]
    {
      CULTURAL,
      LEGAL,
      ORGANIZATIONAL,
      PROJECT,
      TECHNOLOGICAL,
      PHYSICAL,
      OTHER,
    };

  /**
   * A public read-only list of all the '<em><b>Constraint Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ConstraintType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Constraint Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ConstraintType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConstraintType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Constraint Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ConstraintType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConstraintType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Constraint Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ConstraintType get(int value)
  {
    switch (value)
    {
      case CULTURAL_VALUE: return CULTURAL;
      case LEGAL_VALUE: return LEGAL;
      case ORGANIZATIONAL_VALUE: return ORGANIZATIONAL;
      case PROJECT_VALUE: return PROJECT;
      case TECHNOLOGICAL_VALUE: return TECHNOLOGICAL;
      case PHYSICAL_VALUE: return PHYSICAL;
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
  private ConstraintType(int value, String name, String literal)
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
  
} //ConstraintType
