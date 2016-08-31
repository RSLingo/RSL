/**
 */
package rslingo.rsl.rsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stakeholder Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage#getStakeholderType()
 * @model
 * @generated
 */
public enum StakeholderType implements Enumerator
{
  /**
   * The '<em><b>Organization</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ORGANIZATION_VALUE
   * @generated
   * @ordered
   */
  ORGANIZATION(0, "Organization", "Organization"),

  /**
   * The '<em><b>Business Unit</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_UNIT_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_UNIT(1, "BusinessUnit", "BusinessUnit"),

  /**
   * The '<em><b>Team</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEAM_VALUE
   * @generated
   * @ordered
   */
  TEAM(2, "Team", "Team"),

  /**
   * The '<em><b>Person</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PERSON_VALUE
   * @generated
   * @ordered
   */
  PERSON(3, "Person", "Person"),

  /**
   * The '<em><b>External System</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXTERNAL_SYSTEM_VALUE
   * @generated
   * @ordered
   */
  EXTERNAL_SYSTEM(4, "ExternalSystem", "ExternalSystem"),

  /**
   * The '<em><b>Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OTHER_VALUE
   * @generated
   * @ordered
   */
  OTHER(5, "Other", "Other");

  /**
   * The '<em><b>Organization</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Organization</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ORGANIZATION
   * @model name="Organization"
   * @generated
   * @ordered
   */
  public static final int ORGANIZATION_VALUE = 0;

  /**
   * The '<em><b>Business Unit</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Unit</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_UNIT
   * @model name="BusinessUnit"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_UNIT_VALUE = 1;

  /**
   * The '<em><b>Team</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Team</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEAM
   * @model name="Team"
   * @generated
   * @ordered
   */
  public static final int TEAM_VALUE = 2;

  /**
   * The '<em><b>Person</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Person</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PERSON
   * @model name="Person"
   * @generated
   * @ordered
   */
  public static final int PERSON_VALUE = 3;

  /**
   * The '<em><b>External System</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>External System</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXTERNAL_SYSTEM
   * @model name="ExternalSystem"
   * @generated
   * @ordered
   */
  public static final int EXTERNAL_SYSTEM_VALUE = 4;

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
  public static final int OTHER_VALUE = 5;

  /**
   * An array of all the '<em><b>Stakeholder Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final StakeholderType[] VALUES_ARRAY =
    new StakeholderType[]
    {
      ORGANIZATION,
      BUSINESS_UNIT,
      TEAM,
      PERSON,
      EXTERNAL_SYSTEM,
      OTHER,
    };

  /**
   * A public read-only list of all the '<em><b>Stakeholder Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<StakeholderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Stakeholder Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StakeholderType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StakeholderType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Stakeholder Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StakeholderType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StakeholderType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Stakeholder Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StakeholderType get(int value)
  {
    switch (value)
    {
      case ORGANIZATION_VALUE: return ORGANIZATION;
      case BUSINESS_UNIT_VALUE: return BUSINESS_UNIT;
      case TEAM_VALUE: return TEAM;
      case PERSON_VALUE: return PERSON;
      case EXTERNAL_SYSTEM_VALUE: return EXTERNAL_SYSTEM;
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
  private StakeholderType(int value, String name, String literal)
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
  
} //StakeholderType
