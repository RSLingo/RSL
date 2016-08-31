/**
 */
package rslingo.rsl.rsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stakeholder Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage#getStakeholderCategory()
 * @model
 * @generated
 */
public enum StakeholderCategory implements Enumerator
{
  /**
   * The '<em><b>Business</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_VALUE
   * @generated
   * @ordered
   */
  BUSINESS(0, "Business", "Business"),

  /**
   * The '<em><b>Business Customer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_CUSTOMER_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_CUSTOMER(1, "Business_Customer", "Business_Customer"),

  /**
   * The '<em><b>Business Sponsor</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_SPONSOR_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_SPONSOR(2, "Business_Sponsor", "Business_Sponsor"),

  /**
   * The '<em><b>Business User</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_USER_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_USER(3, "Business_User", "Business_User"),

  /**
   * The '<em><b>Business User Direct</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_USER_DIRECT_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_USER_DIRECT(4, "Business_User_Direct", "Business_User_Direct"),

  /**
   * The '<em><b>Business User Indirect</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_USER_INDIRECT_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_USER_INDIRECT(5, "Business_User_Indirect", "Business_User_Indirect"),

  /**
   * The '<em><b>Business Advisor</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_ADVISOR_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_ADVISOR(6, "Business_Advisor", "Business_Advisor"),

  /**
   * The '<em><b>Business Domain Expert</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_DOMAIN_EXPERT_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_DOMAIN_EXPERT(7, "Business_DomainExpert", "Business_DomainExpert"),

  /**
   * The '<em><b>Business Government</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_GOVERNMENT_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_GOVERNMENT(8, "Business_Government", "Business_Government"),

  /**
   * The '<em><b>Business Regulator Agent</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_REGULATOR_AGENT_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_REGULATOR_AGENT(9, "Business_RegulatorAgent", "Business_RegulatorAgent"),

  /**
   * The '<em><b>Business Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_OTHER_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_OTHER(10, "Business_Other", "Business_Other"),

  /**
   * The '<em><b>Manager</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANAGER_VALUE
   * @generated
   * @ordered
   */
  MANAGER(11, "Manager", "Manager"),

  /**
   * The '<em><b>Manager Project Manager</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANAGER_PROJECT_MANAGER_VALUE
   * @generated
   * @ordered
   */
  MANAGER_PROJECT_MANAGER(12, "Manager_ProjectManager", "Manager_ProjectManager"),

  /**
   * The '<em><b>Manager Team Manager</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANAGER_TEAM_MANAGER_VALUE
   * @generated
   * @ordered
   */
  MANAGER_TEAM_MANAGER(13, "Manager_TeamManager", "Manager_TeamManager"),

  /**
   * The '<em><b>Manager Functional Manager</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANAGER_FUNCTIONAL_MANAGER_VALUE
   * @generated
   * @ordered
   */
  MANAGER_FUNCTIONAL_MANAGER(14, "Manager_FunctionalManager", "Manager_FunctionalManager"),

  /**
   * The '<em><b>Manager Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANAGER_OTHER_VALUE
   * @generated
   * @ordered
   */
  MANAGER_OTHER(15, "Manager_Other", "Manager_Other"),

  /**
   * The '<em><b>Technical</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TECHNICAL_VALUE
   * @generated
   * @ordered
   */
  TECHNICAL(16, "Technical", "Technical"),

  /**
   * The '<em><b>Technical Business Analyst</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TECHNICAL_BUSINESS_ANALYST_VALUE
   * @generated
   * @ordered
   */
  TECHNICAL_BUSINESS_ANALYST(17, "Technical_BusinessAnalyst", "Technical_BusinessAnalyst"),

  /**
   * The '<em><b>Technical Requirements Engineer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TECHNICAL_REQUIREMENTS_ENGINEER_VALUE
   * @generated
   * @ordered
   */
  TECHNICAL_REQUIREMENTS_ENGINEER(18, "Technical_RequirementsEngineer", "Technical_RequirementsEngineer"),

  /**
   * The '<em><b>Technical Trainer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TECHNICAL_TRAINER_VALUE
   * @generated
   * @ordered
   */
  TECHNICAL_TRAINER(19, "Technical_Trainer", "Technical_Trainer"),

  /**
   * The '<em><b>Technical Software Architect</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TECHNICAL_SOFTWARE_ARCHITECT_VALUE
   * @generated
   * @ordered
   */
  TECHNICAL_SOFTWARE_ARCHITECT(20, "Technical_SoftwareArchitect", "Technical_SoftwareArchitect"),

  /**
   * The '<em><b>Technical Software Designer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TECHNICAL_SOFTWARE_DESIGNER_VALUE
   * @generated
   * @ordered
   */
  TECHNICAL_SOFTWARE_DESIGNER(21, "Technical_SoftwareDesigner", "Technical_SoftwareDesigner"),

  /**
   * The '<em><b>Technical Software Tester</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TECHNICAL_SOFTWARE_TESTER_VALUE
   * @generated
   * @ordered
   */
  TECHNICAL_SOFTWARE_TESTER(22, "Technical_SoftwareTester", "Technical_SoftwareTester"),

  /**
   * The '<em><b>Technical Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TECHNICAL_OTHER_VALUE
   * @generated
   * @ordered
   */
  TECHNICAL_OTHER(23, "Technical_Other", "Technical_Other"),

  /**
   * The '<em><b>External System</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXTERNAL_SYSTEM_VALUE
   * @generated
   * @ordered
   */
  EXTERNAL_SYSTEM(24, "ExternalSystem", "ExternalSystem"),

  /**
   * The '<em><b>Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OTHER_VALUE
   * @generated
   * @ordered
   */
  OTHER(25, "Other", "Other");

  /**
   * The '<em><b>Business</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS
   * @model name="Business"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_VALUE = 0;

  /**
   * The '<em><b>Business Customer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Customer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_CUSTOMER
   * @model name="Business_Customer"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_CUSTOMER_VALUE = 1;

  /**
   * The '<em><b>Business Sponsor</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Sponsor</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_SPONSOR
   * @model name="Business_Sponsor"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_SPONSOR_VALUE = 2;

  /**
   * The '<em><b>Business User</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business User</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_USER
   * @model name="Business_User"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_USER_VALUE = 3;

  /**
   * The '<em><b>Business User Direct</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business User Direct</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_USER_DIRECT
   * @model name="Business_User_Direct"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_USER_DIRECT_VALUE = 4;

  /**
   * The '<em><b>Business User Indirect</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business User Indirect</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_USER_INDIRECT
   * @model name="Business_User_Indirect"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_USER_INDIRECT_VALUE = 5;

  /**
   * The '<em><b>Business Advisor</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Advisor</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_ADVISOR
   * @model name="Business_Advisor"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_ADVISOR_VALUE = 6;

  /**
   * The '<em><b>Business Domain Expert</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Domain Expert</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_DOMAIN_EXPERT
   * @model name="Business_DomainExpert"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_DOMAIN_EXPERT_VALUE = 7;

  /**
   * The '<em><b>Business Government</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Government</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_GOVERNMENT
   * @model name="Business_Government"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_GOVERNMENT_VALUE = 8;

  /**
   * The '<em><b>Business Regulator Agent</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Regulator Agent</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_REGULATOR_AGENT
   * @model name="Business_RegulatorAgent"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_REGULATOR_AGENT_VALUE = 9;

  /**
   * The '<em><b>Business Other</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Other</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_OTHER
   * @model name="Business_Other"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_OTHER_VALUE = 10;

  /**
   * The '<em><b>Manager</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Manager</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANAGER
   * @model name="Manager"
   * @generated
   * @ordered
   */
  public static final int MANAGER_VALUE = 11;

  /**
   * The '<em><b>Manager Project Manager</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Manager Project Manager</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANAGER_PROJECT_MANAGER
   * @model name="Manager_ProjectManager"
   * @generated
   * @ordered
   */
  public static final int MANAGER_PROJECT_MANAGER_VALUE = 12;

  /**
   * The '<em><b>Manager Team Manager</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Manager Team Manager</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANAGER_TEAM_MANAGER
   * @model name="Manager_TeamManager"
   * @generated
   * @ordered
   */
  public static final int MANAGER_TEAM_MANAGER_VALUE = 13;

  /**
   * The '<em><b>Manager Functional Manager</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Manager Functional Manager</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANAGER_FUNCTIONAL_MANAGER
   * @model name="Manager_FunctionalManager"
   * @generated
   * @ordered
   */
  public static final int MANAGER_FUNCTIONAL_MANAGER_VALUE = 14;

  /**
   * The '<em><b>Manager Other</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Manager Other</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANAGER_OTHER
   * @model name="Manager_Other"
   * @generated
   * @ordered
   */
  public static final int MANAGER_OTHER_VALUE = 15;

  /**
   * The '<em><b>Technical</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Technical</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TECHNICAL
   * @model name="Technical"
   * @generated
   * @ordered
   */
  public static final int TECHNICAL_VALUE = 16;

  /**
   * The '<em><b>Technical Business Analyst</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Technical Business Analyst</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TECHNICAL_BUSINESS_ANALYST
   * @model name="Technical_BusinessAnalyst"
   * @generated
   * @ordered
   */
  public static final int TECHNICAL_BUSINESS_ANALYST_VALUE = 17;

  /**
   * The '<em><b>Technical Requirements Engineer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Technical Requirements Engineer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TECHNICAL_REQUIREMENTS_ENGINEER
   * @model name="Technical_RequirementsEngineer"
   * @generated
   * @ordered
   */
  public static final int TECHNICAL_REQUIREMENTS_ENGINEER_VALUE = 18;

  /**
   * The '<em><b>Technical Trainer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Technical Trainer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TECHNICAL_TRAINER
   * @model name="Technical_Trainer"
   * @generated
   * @ordered
   */
  public static final int TECHNICAL_TRAINER_VALUE = 19;

  /**
   * The '<em><b>Technical Software Architect</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Technical Software Architect</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TECHNICAL_SOFTWARE_ARCHITECT
   * @model name="Technical_SoftwareArchitect"
   * @generated
   * @ordered
   */
  public static final int TECHNICAL_SOFTWARE_ARCHITECT_VALUE = 20;

  /**
   * The '<em><b>Technical Software Designer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Technical Software Designer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TECHNICAL_SOFTWARE_DESIGNER
   * @model name="Technical_SoftwareDesigner"
   * @generated
   * @ordered
   */
  public static final int TECHNICAL_SOFTWARE_DESIGNER_VALUE = 21;

  /**
   * The '<em><b>Technical Software Tester</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Technical Software Tester</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TECHNICAL_SOFTWARE_TESTER
   * @model name="Technical_SoftwareTester"
   * @generated
   * @ordered
   */
  public static final int TECHNICAL_SOFTWARE_TESTER_VALUE = 22;

  /**
   * The '<em><b>Technical Other</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Technical Other</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TECHNICAL_OTHER
   * @model name="Technical_Other"
   * @generated
   * @ordered
   */
  public static final int TECHNICAL_OTHER_VALUE = 23;

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
  public static final int EXTERNAL_SYSTEM_VALUE = 24;

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
  public static final int OTHER_VALUE = 25;

  /**
   * An array of all the '<em><b>Stakeholder Category</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final StakeholderCategory[] VALUES_ARRAY =
    new StakeholderCategory[]
    {
      BUSINESS,
      BUSINESS_CUSTOMER,
      BUSINESS_SPONSOR,
      BUSINESS_USER,
      BUSINESS_USER_DIRECT,
      BUSINESS_USER_INDIRECT,
      BUSINESS_ADVISOR,
      BUSINESS_DOMAIN_EXPERT,
      BUSINESS_GOVERNMENT,
      BUSINESS_REGULATOR_AGENT,
      BUSINESS_OTHER,
      MANAGER,
      MANAGER_PROJECT_MANAGER,
      MANAGER_TEAM_MANAGER,
      MANAGER_FUNCTIONAL_MANAGER,
      MANAGER_OTHER,
      TECHNICAL,
      TECHNICAL_BUSINESS_ANALYST,
      TECHNICAL_REQUIREMENTS_ENGINEER,
      TECHNICAL_TRAINER,
      TECHNICAL_SOFTWARE_ARCHITECT,
      TECHNICAL_SOFTWARE_DESIGNER,
      TECHNICAL_SOFTWARE_TESTER,
      TECHNICAL_OTHER,
      EXTERNAL_SYSTEM,
      OTHER,
    };

  /**
   * A public read-only list of all the '<em><b>Stakeholder Category</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<StakeholderCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Stakeholder Category</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StakeholderCategory get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StakeholderCategory result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Stakeholder Category</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StakeholderCategory getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StakeholderCategory result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Stakeholder Category</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static StakeholderCategory get(int value)
  {
    switch (value)
    {
      case BUSINESS_VALUE: return BUSINESS;
      case BUSINESS_CUSTOMER_VALUE: return BUSINESS_CUSTOMER;
      case BUSINESS_SPONSOR_VALUE: return BUSINESS_SPONSOR;
      case BUSINESS_USER_VALUE: return BUSINESS_USER;
      case BUSINESS_USER_DIRECT_VALUE: return BUSINESS_USER_DIRECT;
      case BUSINESS_USER_INDIRECT_VALUE: return BUSINESS_USER_INDIRECT;
      case BUSINESS_ADVISOR_VALUE: return BUSINESS_ADVISOR;
      case BUSINESS_DOMAIN_EXPERT_VALUE: return BUSINESS_DOMAIN_EXPERT;
      case BUSINESS_GOVERNMENT_VALUE: return BUSINESS_GOVERNMENT;
      case BUSINESS_REGULATOR_AGENT_VALUE: return BUSINESS_REGULATOR_AGENT;
      case BUSINESS_OTHER_VALUE: return BUSINESS_OTHER;
      case MANAGER_VALUE: return MANAGER;
      case MANAGER_PROJECT_MANAGER_VALUE: return MANAGER_PROJECT_MANAGER;
      case MANAGER_TEAM_MANAGER_VALUE: return MANAGER_TEAM_MANAGER;
      case MANAGER_FUNCTIONAL_MANAGER_VALUE: return MANAGER_FUNCTIONAL_MANAGER;
      case MANAGER_OTHER_VALUE: return MANAGER_OTHER;
      case TECHNICAL_VALUE: return TECHNICAL;
      case TECHNICAL_BUSINESS_ANALYST_VALUE: return TECHNICAL_BUSINESS_ANALYST;
      case TECHNICAL_REQUIREMENTS_ENGINEER_VALUE: return TECHNICAL_REQUIREMENTS_ENGINEER;
      case TECHNICAL_TRAINER_VALUE: return TECHNICAL_TRAINER;
      case TECHNICAL_SOFTWARE_ARCHITECT_VALUE: return TECHNICAL_SOFTWARE_ARCHITECT;
      case TECHNICAL_SOFTWARE_DESIGNER_VALUE: return TECHNICAL_SOFTWARE_DESIGNER;
      case TECHNICAL_SOFTWARE_TESTER_VALUE: return TECHNICAL_SOFTWARE_TESTER;
      case TECHNICAL_OTHER_VALUE: return TECHNICAL_OTHER;
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
  private StakeholderCategory(int value, String name, String literal)
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
  
} //StakeholderCategory
