/**
 */
package rslingo.rsl.rsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>System Relation Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage#getSystemRelationCategory()
 * @model
 * @generated
 */
public enum SystemRelationCategory implements Enumerator
{
  /**
   * The '<em><b>Import</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMPORT_VALUE
   * @generated
   * @ordered
   */
  IMPORT(0, "Import", "Import"),

  /**
   * The '<em><b>Export</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXPORT_VALUE
   * @generated
   * @ordered
   */
  EXPORT(1, "Export", "Export"),

  /**
   * The '<em><b>Import Export</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMPORT_EXPORT_VALUE
   * @generated
   * @ordered
   */
  IMPORT_EXPORT(2, "ImportExport", "ImportExport"),

  /**
   * The '<em><b>Sync</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYNC_VALUE
   * @generated
   * @ordered
   */
  SYNC(3, "Sync", "Sync"),

  /**
   * The '<em><b>Interact</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERACT_VALUE
   * @generated
   * @ordered
   */
  INTERACT(4, "Interact", "Interact"),

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
   * The '<em><b>Import</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Import</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMPORT
   * @model name="Import"
   * @generated
   * @ordered
   */
  public static final int IMPORT_VALUE = 0;

  /**
   * The '<em><b>Export</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Export</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXPORT
   * @model name="Export"
   * @generated
   * @ordered
   */
  public static final int EXPORT_VALUE = 1;

  /**
   * The '<em><b>Import Export</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Import Export</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMPORT_EXPORT
   * @model name="ImportExport"
   * @generated
   * @ordered
   */
  public static final int IMPORT_EXPORT_VALUE = 2;

  /**
   * The '<em><b>Sync</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sync</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYNC
   * @model name="Sync"
   * @generated
   * @ordered
   */
  public static final int SYNC_VALUE = 3;

  /**
   * The '<em><b>Interact</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Interact</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTERACT
   * @model name="Interact"
   * @generated
   * @ordered
   */
  public static final int INTERACT_VALUE = 4;

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
   * An array of all the '<em><b>System Relation Category</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SystemRelationCategory[] VALUES_ARRAY =
    new SystemRelationCategory[]
    {
      IMPORT,
      EXPORT,
      IMPORT_EXPORT,
      SYNC,
      INTERACT,
      OTHER,
    };

  /**
   * A public read-only list of all the '<em><b>System Relation Category</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SystemRelationCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>System Relation Category</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SystemRelationCategory get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SystemRelationCategory result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>System Relation Category</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SystemRelationCategory getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SystemRelationCategory result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>System Relation Category</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SystemRelationCategory get(int value)
  {
    switch (value)
    {
      case IMPORT_VALUE: return IMPORT;
      case EXPORT_VALUE: return EXPORT;
      case IMPORT_EXPORT_VALUE: return IMPORT_EXPORT;
      case SYNC_VALUE: return SYNC;
      case INTERACT_VALUE: return INTERACT;
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
  private SystemRelationCategory(int value, String name, String literal)
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
  
} //SystemRelationCategory
