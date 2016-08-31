/**
 */
package rslingo.rsl.rsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Use Case Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage#getUseCaseType()
 * @model
 * @generated
 */
public enum UseCaseType implements Enumerator
{
  /**
   * The '<em><b>Entity Create</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITY_CREATE_VALUE
   * @generated
   * @ordered
   */
  ENTITY_CREATE(0, "EntityCreate", "EntityCreate"),

  /**
   * The '<em><b>Entity Read</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITY_READ_VALUE
   * @generated
   * @ordered
   */
  ENTITY_READ(1, "EntityRead", "EntityRead"),

  /**
   * The '<em><b>Entity Update</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITY_UPDATE_VALUE
   * @generated
   * @ordered
   */
  ENTITY_UPDATE(2, "EntityUpdate", "EntityUpdate"),

  /**
   * The '<em><b>Entity Delete</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITY_DELETE_VALUE
   * @generated
   * @ordered
   */
  ENTITY_DELETE(3, "EntityDelete", "EntityDelete"),

  /**
   * The '<em><b>Entity Report</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITY_REPORT_VALUE
   * @generated
   * @ordered
   */
  ENTITY_REPORT(4, "EntityReport", "EntityReport"),

  /**
   * The '<em><b>Entity Dashboard</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITY_DASHBOARD_VALUE
   * @generated
   * @ordered
   */
  ENTITY_DASHBOARD(5, "EntityDashboard", "EntityDashboard"),

  /**
   * The '<em><b>Entity Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITY_OTHER_VALUE
   * @generated
   * @ordered
   */
  ENTITY_OTHER(6, "EntityOther", "EntityOther"),

  /**
   * The '<em><b>Entities Manage</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_MANAGE_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_MANAGE(7, "EntitiesManage", "EntitiesManage"),

  /**
   * The '<em><b>Entities Browse</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_BROWSE_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_BROWSE(8, "EntitiesBrowse", "EntitiesBrowse"),

  /**
   * The '<em><b>Entities Search</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_SEARCH_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_SEARCH(9, "EntitiesSearch", "EntitiesSearch"),

  /**
   * The '<em><b>Entities Report</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_REPORT_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_REPORT(10, "EntitiesReport", "EntitiesReport"),

  /**
   * The '<em><b>Entities Dashboard</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_DASHBOARD_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_DASHBOARD(11, "EntitiesDashboard", "EntitiesDashboard"),

  /**
   * The '<em><b>Entities Interop Import</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_INTEROP_IMPORT_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_INTEROP_IMPORT(12, "EntitiesInteropImport", "EntitiesInteropImport"),

  /**
   * The '<em><b>Entities Interop Export</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_INTEROP_EXPORT_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_INTEROP_EXPORT(13, "EntitiesInteropExport", "EntitiesInteropExport"),

  /**
   * The '<em><b>Entities Interop Sync</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_INTEROP_SYNC_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_INTEROP_SYNC(14, "EntitiesInteropSync", "EntitiesInteropSync"),

  /**
   * The '<em><b>Entities Interop Send Message</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_INTEROP_SEND_MESSAGE_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_INTEROP_SEND_MESSAGE(15, "EntitiesInteropSendMessage", "EntitiesInteropSendMessage"),

  /**
   * The '<em><b>Entities Interop Service Invocation</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_INTEROP_SERVICE_INVOCATION_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_INTEROP_SERVICE_INVOCATION(16, "EntitiesInteropServiceInvocation", "EntitiesInteropServiceInvocation"),

  /**
   * The '<em><b>Entities Map Show</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_MAP_SHOW_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_MAP_SHOW(17, "EntitiesMapShow", "EntitiesMapShow"),

  /**
   * The '<em><b>Entities Map Interact</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_MAP_INTERACT_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_MAP_INTERACT(18, "EntitiesMapInteract", "EntitiesMapInteract"),

  /**
   * The '<em><b>Entities Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTITIES_OTHER_VALUE
   * @generated
   * @ordered
   */
  ENTITIES_OTHER(19, "EntitiesOther", "EntitiesOther"),

  /**
   * The '<em><b>Other</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OTHER_VALUE
   * @generated
   * @ordered
   */
  OTHER(20, "Other", "Other");

  /**
   * The '<em><b>Entity Create</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entity Create</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITY_CREATE
   * @model name="EntityCreate"
   * @generated
   * @ordered
   */
  public static final int ENTITY_CREATE_VALUE = 0;

  /**
   * The '<em><b>Entity Read</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entity Read</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITY_READ
   * @model name="EntityRead"
   * @generated
   * @ordered
   */
  public static final int ENTITY_READ_VALUE = 1;

  /**
   * The '<em><b>Entity Update</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entity Update</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITY_UPDATE
   * @model name="EntityUpdate"
   * @generated
   * @ordered
   */
  public static final int ENTITY_UPDATE_VALUE = 2;

  /**
   * The '<em><b>Entity Delete</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entity Delete</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITY_DELETE
   * @model name="EntityDelete"
   * @generated
   * @ordered
   */
  public static final int ENTITY_DELETE_VALUE = 3;

  /**
   * The '<em><b>Entity Report</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entity Report</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITY_REPORT
   * @model name="EntityReport"
   * @generated
   * @ordered
   */
  public static final int ENTITY_REPORT_VALUE = 4;

  /**
   * The '<em><b>Entity Dashboard</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entity Dashboard</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITY_DASHBOARD
   * @model name="EntityDashboard"
   * @generated
   * @ordered
   */
  public static final int ENTITY_DASHBOARD_VALUE = 5;

  /**
   * The '<em><b>Entity Other</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entity Other</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITY_OTHER
   * @model name="EntityOther"
   * @generated
   * @ordered
   */
  public static final int ENTITY_OTHER_VALUE = 6;

  /**
   * The '<em><b>Entities Manage</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Manage</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_MANAGE
   * @model name="EntitiesManage"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_MANAGE_VALUE = 7;

  /**
   * The '<em><b>Entities Browse</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Browse</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_BROWSE
   * @model name="EntitiesBrowse"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_BROWSE_VALUE = 8;

  /**
   * The '<em><b>Entities Search</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Search</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_SEARCH
   * @model name="EntitiesSearch"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_SEARCH_VALUE = 9;

  /**
   * The '<em><b>Entities Report</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Report</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_REPORT
   * @model name="EntitiesReport"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_REPORT_VALUE = 10;

  /**
   * The '<em><b>Entities Dashboard</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Dashboard</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_DASHBOARD
   * @model name="EntitiesDashboard"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_DASHBOARD_VALUE = 11;

  /**
   * The '<em><b>Entities Interop Import</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Interop Import</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_INTEROP_IMPORT
   * @model name="EntitiesInteropImport"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_INTEROP_IMPORT_VALUE = 12;

  /**
   * The '<em><b>Entities Interop Export</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Interop Export</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_INTEROP_EXPORT
   * @model name="EntitiesInteropExport"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_INTEROP_EXPORT_VALUE = 13;

  /**
   * The '<em><b>Entities Interop Sync</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Interop Sync</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_INTEROP_SYNC
   * @model name="EntitiesInteropSync"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_INTEROP_SYNC_VALUE = 14;

  /**
   * The '<em><b>Entities Interop Send Message</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Interop Send Message</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_INTEROP_SEND_MESSAGE
   * @model name="EntitiesInteropSendMessage"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_INTEROP_SEND_MESSAGE_VALUE = 15;

  /**
   * The '<em><b>Entities Interop Service Invocation</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Interop Service Invocation</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_INTEROP_SERVICE_INVOCATION
   * @model name="EntitiesInteropServiceInvocation"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_INTEROP_SERVICE_INVOCATION_VALUE = 16;

  /**
   * The '<em><b>Entities Map Show</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Map Show</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_MAP_SHOW
   * @model name="EntitiesMapShow"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_MAP_SHOW_VALUE = 17;

  /**
   * The '<em><b>Entities Map Interact</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Map Interact</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_MAP_INTERACT
   * @model name="EntitiesMapInteract"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_MAP_INTERACT_VALUE = 18;

  /**
   * The '<em><b>Entities Other</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Entities Other</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTITIES_OTHER
   * @model name="EntitiesOther"
   * @generated
   * @ordered
   */
  public static final int ENTITIES_OTHER_VALUE = 19;

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
  public static final int OTHER_VALUE = 20;

  /**
   * An array of all the '<em><b>Use Case Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final UseCaseType[] VALUES_ARRAY =
    new UseCaseType[]
    {
      ENTITY_CREATE,
      ENTITY_READ,
      ENTITY_UPDATE,
      ENTITY_DELETE,
      ENTITY_REPORT,
      ENTITY_DASHBOARD,
      ENTITY_OTHER,
      ENTITIES_MANAGE,
      ENTITIES_BROWSE,
      ENTITIES_SEARCH,
      ENTITIES_REPORT,
      ENTITIES_DASHBOARD,
      ENTITIES_INTEROP_IMPORT,
      ENTITIES_INTEROP_EXPORT,
      ENTITIES_INTEROP_SYNC,
      ENTITIES_INTEROP_SEND_MESSAGE,
      ENTITIES_INTEROP_SERVICE_INVOCATION,
      ENTITIES_MAP_SHOW,
      ENTITIES_MAP_INTERACT,
      ENTITIES_OTHER,
      OTHER,
    };

  /**
   * A public read-only list of all the '<em><b>Use Case Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<UseCaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Use Case Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UseCaseType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UseCaseType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Use Case Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UseCaseType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UseCaseType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Use Case Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UseCaseType get(int value)
  {
    switch (value)
    {
      case ENTITY_CREATE_VALUE: return ENTITY_CREATE;
      case ENTITY_READ_VALUE: return ENTITY_READ;
      case ENTITY_UPDATE_VALUE: return ENTITY_UPDATE;
      case ENTITY_DELETE_VALUE: return ENTITY_DELETE;
      case ENTITY_REPORT_VALUE: return ENTITY_REPORT;
      case ENTITY_DASHBOARD_VALUE: return ENTITY_DASHBOARD;
      case ENTITY_OTHER_VALUE: return ENTITY_OTHER;
      case ENTITIES_MANAGE_VALUE: return ENTITIES_MANAGE;
      case ENTITIES_BROWSE_VALUE: return ENTITIES_BROWSE;
      case ENTITIES_SEARCH_VALUE: return ENTITIES_SEARCH;
      case ENTITIES_REPORT_VALUE: return ENTITIES_REPORT;
      case ENTITIES_DASHBOARD_VALUE: return ENTITIES_DASHBOARD;
      case ENTITIES_INTEROP_IMPORT_VALUE: return ENTITIES_INTEROP_IMPORT;
      case ENTITIES_INTEROP_EXPORT_VALUE: return ENTITIES_INTEROP_EXPORT;
      case ENTITIES_INTEROP_SYNC_VALUE: return ENTITIES_INTEROP_SYNC;
      case ENTITIES_INTEROP_SEND_MESSAGE_VALUE: return ENTITIES_INTEROP_SEND_MESSAGE;
      case ENTITIES_INTEROP_SERVICE_INVOCATION_VALUE: return ENTITIES_INTEROP_SERVICE_INVOCATION;
      case ENTITIES_MAP_SHOW_VALUE: return ENTITIES_MAP_SHOW;
      case ENTITIES_MAP_INTERACT_VALUE: return ENTITIES_MAP_INTERACT;
      case ENTITIES_OTHER_VALUE: return ENTITIES_OTHER;
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
  private UseCaseType(int value, String name, String literal)
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
  
} //UseCaseType
