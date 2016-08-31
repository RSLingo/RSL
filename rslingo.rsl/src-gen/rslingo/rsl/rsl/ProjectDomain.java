/**
 */
package rslingo.rsl.rsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Project Domain</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage#getProjectDomain()
 * @model
 * @generated
 */
public enum ProjectDomain implements Enumerator
{
  /**
   * The '<em><b>Public Sector</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PUBLIC_SECTOR_VALUE
   * @generated
   * @ordered
   */
  PUBLIC_SECTOR(0, "PublicSector", "PublicSector"),

  /**
   * The '<em><b>Education</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EDUCATION_VALUE
   * @generated
   * @ordered
   */
  EDUCATION(1, "Education", "Education"),

  /**
   * The '<em><b>Health</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HEALTH_VALUE
   * @generated
   * @ordered
   */
  HEALTH(2, "Health", "Health"),

  /**
   * The '<em><b>Telecoms</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TELECOMS_VALUE
   * @generated
   * @ordered
   */
  TELECOMS(3, "Telecoms", "Telecoms"),

  /**
   * The '<em><b>Energy And Utilities</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENERGY_AND_UTILITIES_VALUE
   * @generated
   * @ordered
   */
  ENERGY_AND_UTILITIES(4, "EnergyAndUtilities", "EnergyAndUtilities"),

  /**
   * The '<em><b>Finance And Banks</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINANCE_AND_BANKS_VALUE
   * @generated
   * @ordered
   */
  FINANCE_AND_BANKS(5, "FinanceAndBanks", "FinanceAndBanks"),

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
   * The '<em><b>Public Sector</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Public Sector</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PUBLIC_SECTOR
   * @model name="PublicSector"
   * @generated
   * @ordered
   */
  public static final int PUBLIC_SECTOR_VALUE = 0;

  /**
   * The '<em><b>Education</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Education</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EDUCATION
   * @model name="Education"
   * @generated
   * @ordered
   */
  public static final int EDUCATION_VALUE = 1;

  /**
   * The '<em><b>Health</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Health</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HEALTH
   * @model name="Health"
   * @generated
   * @ordered
   */
  public static final int HEALTH_VALUE = 2;

  /**
   * The '<em><b>Telecoms</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Telecoms</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TELECOMS
   * @model name="Telecoms"
   * @generated
   * @ordered
   */
  public static final int TELECOMS_VALUE = 3;

  /**
   * The '<em><b>Energy And Utilities</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Energy And Utilities</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENERGY_AND_UTILITIES
   * @model name="EnergyAndUtilities"
   * @generated
   * @ordered
   */
  public static final int ENERGY_AND_UTILITIES_VALUE = 4;

  /**
   * The '<em><b>Finance And Banks</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Finance And Banks</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FINANCE_AND_BANKS
   * @model name="FinanceAndBanks"
   * @generated
   * @ordered
   */
  public static final int FINANCE_AND_BANKS_VALUE = 5;

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
   * An array of all the '<em><b>Project Domain</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ProjectDomain[] VALUES_ARRAY =
    new ProjectDomain[]
    {
      PUBLIC_SECTOR,
      EDUCATION,
      HEALTH,
      TELECOMS,
      ENERGY_AND_UTILITIES,
      FINANCE_AND_BANKS,
      OTHER,
    };

  /**
   * A public read-only list of all the '<em><b>Project Domain</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ProjectDomain> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Project Domain</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ProjectDomain get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ProjectDomain result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Project Domain</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ProjectDomain getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ProjectDomain result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Project Domain</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ProjectDomain get(int value)
  {
    switch (value)
    {
      case PUBLIC_SECTOR_VALUE: return PUBLIC_SECTOR;
      case EDUCATION_VALUE: return EDUCATION;
      case HEALTH_VALUE: return HEALTH;
      case TELECOMS_VALUE: return TELECOMS;
      case ENERGY_AND_UTILITIES_VALUE: return ENERGY_AND_UTILITIES;
      case FINANCE_AND_BANKS_VALUE: return FINANCE_AND_BANKS;
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
  private ProjectDomain(int value, String name, String literal)
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
  
} //ProjectDomain
