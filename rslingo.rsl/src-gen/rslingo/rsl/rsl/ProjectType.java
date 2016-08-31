/**
 */
package rslingo.rsl.rsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Project Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage#getProjectType()
 * @model
 * @generated
 */
public enum ProjectType implements Enumerator
{
  /**
   * The '<em><b>Development</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEVELOPMENT_VALUE
   * @generated
   * @ordered
   */
  DEVELOPMENT(0, "Development", "Development"),

  /**
   * The '<em><b>Design</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DESIGN_VALUE
   * @generated
   * @ordered
   */
  DESIGN(1, "Design", "Design"),

  /**
   * The '<em><b>Deployment</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEPLOYMENT_VALUE
   * @generated
   * @ordered
   */
  DEPLOYMENT(2, "Deployment", "Deployment"),

  /**
   * The '<em><b>Maintenance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAINTENANCE_VALUE
   * @generated
   * @ordered
   */
  MAINTENANCE(3, "Maintenance", "Maintenance"),

  /**
   * The '<em><b>Auditing</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AUDITING_VALUE
   * @generated
   * @ordered
   */
  AUDITING(4, "Auditing", "Auditing"),

  /**
   * The '<em><b>Training</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRAINING_VALUE
   * @generated
   * @ordered
   */
  TRAINING(5, "Training", "Training"),

  /**
   * The '<em><b>Research</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RESEARCH_VALUE
   * @generated
   * @ordered
   */
  RESEARCH(6, "Research", "Research"),

  /**
   * The '<em><b>Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OTHER_VALUE
   * @generated
   * @ordered
   */
  OTHER(7, "Other", "Other");

  /**
   * The '<em><b>Development</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Development</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEVELOPMENT
   * @model name="Development"
   * @generated
   * @ordered
   */
  public static final int DEVELOPMENT_VALUE = 0;

  /**
   * The '<em><b>Design</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Design</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DESIGN
   * @model name="Design"
   * @generated
   * @ordered
   */
  public static final int DESIGN_VALUE = 1;

  /**
   * The '<em><b>Deployment</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Deployment</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEPLOYMENT
   * @model name="Deployment"
   * @generated
   * @ordered
   */
  public static final int DEPLOYMENT_VALUE = 2;

  /**
   * The '<em><b>Maintenance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Maintenance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAINTENANCE
   * @model name="Maintenance"
   * @generated
   * @ordered
   */
  public static final int MAINTENANCE_VALUE = 3;

  /**
   * The '<em><b>Auditing</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Auditing</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AUDITING
   * @model name="Auditing"
   * @generated
   * @ordered
   */
  public static final int AUDITING_VALUE = 4;

  /**
   * The '<em><b>Training</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Training</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRAINING
   * @model name="Training"
   * @generated
   * @ordered
   */
  public static final int TRAINING_VALUE = 5;

  /**
   * The '<em><b>Research</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Research</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RESEARCH
   * @model name="Research"
   * @generated
   * @ordered
   */
  public static final int RESEARCH_VALUE = 6;

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
  public static final int OTHER_VALUE = 7;

  /**
   * An array of all the '<em><b>Project Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ProjectType[] VALUES_ARRAY =
    new ProjectType[]
    {
      DEVELOPMENT,
      DESIGN,
      DEPLOYMENT,
      MAINTENANCE,
      AUDITING,
      TRAINING,
      RESEARCH,
      OTHER,
    };

  /**
   * A public read-only list of all the '<em><b>Project Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ProjectType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Project Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ProjectType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ProjectType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Project Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ProjectType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ProjectType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Project Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ProjectType get(int value)
  {
    switch (value)
    {
      case DEVELOPMENT_VALUE: return DEVELOPMENT;
      case DESIGN_VALUE: return DESIGN;
      case DEPLOYMENT_VALUE: return DEPLOYMENT;
      case MAINTENANCE_VALUE: return MAINTENANCE;
      case AUDITING_VALUE: return AUDITING;
      case TRAINING_VALUE: return TRAINING;
      case RESEARCH_VALUE: return RESEARCH;
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
  private ProjectType(int value, String name, String literal)
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
  
} //ProjectType
