/**
 */
package rslingo.rsl.rsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Requirement Relation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage#getRequirementRelationType()
 * @model
 * @generated
 */
public enum RequirementRelationType implements Enumerator
{
  /**
   * The '<em><b>Requires</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REQUIRES_VALUE
   * @generated
   * @ordered
   */
  REQUIRES(0, "Requires", "Requires"),

  /**
   * The '<em><b>Supports</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUPPORTS_VALUE
   * @generated
   * @ordered
   */
  SUPPORTS(1, "Supports", "Supports"),

  /**
   * The '<em><b>Obstructs</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OBSTRUCTS_VALUE
   * @generated
   * @ordered
   */
  OBSTRUCTS(2, "Obstructs", "Obstructs"),

  /**
   * The '<em><b>Conflicts</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONFLICTS_VALUE
   * @generated
   * @ordered
   */
  CONFLICTS(3, "Conflicts", "Conflicts"),

  /**
   * The '<em><b>Identical</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IDENTICAL_VALUE
   * @generated
   * @ordered
   */
  IDENTICAL(4, "Identical", "Identical"),

  /**
   * The '<em><b>Relates</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RELATES_VALUE
   * @generated
   * @ordered
   */
  RELATES(5, "Relates", "Relates"),

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
   * The '<em><b>Requires</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Requires</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REQUIRES
   * @model name="Requires"
   * @generated
   * @ordered
   */
  public static final int REQUIRES_VALUE = 0;

  /**
   * The '<em><b>Supports</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Supports</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUPPORTS
   * @model name="Supports"
   * @generated
   * @ordered
   */
  public static final int SUPPORTS_VALUE = 1;

  /**
   * The '<em><b>Obstructs</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Obstructs</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OBSTRUCTS
   * @model name="Obstructs"
   * @generated
   * @ordered
   */
  public static final int OBSTRUCTS_VALUE = 2;

  /**
   * The '<em><b>Conflicts</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Conflicts</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONFLICTS
   * @model name="Conflicts"
   * @generated
   * @ordered
   */
  public static final int CONFLICTS_VALUE = 3;

  /**
   * The '<em><b>Identical</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Identical</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IDENTICAL
   * @model name="Identical"
   * @generated
   * @ordered
   */
  public static final int IDENTICAL_VALUE = 4;

  /**
   * The '<em><b>Relates</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Relates</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RELATES
   * @model name="Relates"
   * @generated
   * @ordered
   */
  public static final int RELATES_VALUE = 5;

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
   * An array of all the '<em><b>Requirement Relation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RequirementRelationType[] VALUES_ARRAY =
    new RequirementRelationType[]
    {
      REQUIRES,
      SUPPORTS,
      OBSTRUCTS,
      CONFLICTS,
      IDENTICAL,
      RELATES,
      OTHER,
    };

  /**
   * A public read-only list of all the '<em><b>Requirement Relation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RequirementRelationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Requirement Relation Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RequirementRelationType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RequirementRelationType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Requirement Relation Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RequirementRelationType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RequirementRelationType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Requirement Relation Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RequirementRelationType get(int value)
  {
    switch (value)
    {
      case REQUIRES_VALUE: return REQUIRES;
      case SUPPORTS_VALUE: return SUPPORTS;
      case OBSTRUCTS_VALUE: return OBSTRUCTS;
      case CONFLICTS_VALUE: return CONFLICTS;
      case IDENTICAL_VALUE: return IDENTICAL;
      case RELATES_VALUE: return RELATES;
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
  private RequirementRelationType(int value, String name, String literal)
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
  
} //RequirementRelationType
