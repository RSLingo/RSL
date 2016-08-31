/**
 */
package rslingo.rsl.rsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage#getAttributeType()
 * @model
 * @generated
 */
public enum AttributeType implements Enumerator
{
  /**
   * The '<em><b>Integer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_VALUE
   * @generated
   * @ordered
   */
  INTEGER(0, "Integer", "Integer"),

  /**
   * The '<em><b>Decimal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECIMAL_VALUE
   * @generated
   * @ordered
   */
  DECIMAL(1, "Decimal", "Decimal"),

  /**
   * The '<em><b>Boolean</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN(2, "Boolean", "Boolean"),

  /**
   * The '<em><b>Currency</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CURRENCY_VALUE
   * @generated
   * @ordered
   */
  CURRENCY(3, "Currency", "Currency"),

  /**
   * The '<em><b>Date</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_VALUE
   * @generated
   * @ordered
   */
  DATE(4, "Date", "Date"),

  /**
   * The '<em><b>Time</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_VALUE
   * @generated
   * @ordered
   */
  TIME(5, "Time", "Time"),

  /**
   * The '<em><b>Datetime</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATETIME_VALUE
   * @generated
   * @ordered
   */
  DATETIME(6, "Datetime", "Datetime"),

  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(7, "String", "String"),

  /**
   * The '<em><b>Text</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEXT_VALUE
   * @generated
   * @ordered
   */
  TEXT(8, "Text", "Text"),

  /**
   * The '<em><b>Regex</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REGEX_VALUE
   * @generated
   * @ordered
   */
  REGEX(9, "Regex", "Regex"),

  /**
   * The '<em><b>URL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #URL_VALUE
   * @generated
   * @ordered
   */
  URL(10, "URL", "URL"),

  /**
   * The '<em><b>Image</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMAGE_VALUE
   * @generated
   * @ordered
   */
  IMAGE(11, "Image", "Image"),

  /**
   * The '<em><b>XML</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XML_VALUE
   * @generated
   * @ordered
   */
  XML(12, "XML", "XML"),

  /**
   * The '<em><b>Binary</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BINARY_VALUE
   * @generated
   * @ordered
   */
  BINARY(13, "Binary", "Binary");

  /**
   * The '<em><b>Integer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTEGER
   * @model name="Integer"
   * @generated
   * @ordered
   */
  public static final int INTEGER_VALUE = 0;

  /**
   * The '<em><b>Decimal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Decimal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DECIMAL
   * @model name="Decimal"
   * @generated
   * @ordered
   */
  public static final int DECIMAL_VALUE = 1;

  /**
   * The '<em><b>Boolean</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @model name="Boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_VALUE = 2;

  /**
   * The '<em><b>Currency</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Currency</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CURRENCY
   * @model name="Currency"
   * @generated
   * @ordered
   */
  public static final int CURRENCY_VALUE = 3;

  /**
   * The '<em><b>Date</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE
   * @model name="Date"
   * @generated
   * @ordered
   */
  public static final int DATE_VALUE = 4;

  /**
   * The '<em><b>Time</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME
   * @model name="Time"
   * @generated
   * @ordered
   */
  public static final int TIME_VALUE = 5;

  /**
   * The '<em><b>Datetime</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Datetime</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATETIME
   * @model name="Datetime"
   * @generated
   * @ordered
   */
  public static final int DATETIME_VALUE = 6;

  /**
   * The '<em><b>String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model name="String"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 7;

  /**
   * The '<em><b>Text</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEXT
   * @model name="Text"
   * @generated
   * @ordered
   */
  public static final int TEXT_VALUE = 8;

  /**
   * The '<em><b>Regex</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Regex</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REGEX
   * @model name="Regex"
   * @generated
   * @ordered
   */
  public static final int REGEX_VALUE = 9;

  /**
   * The '<em><b>URL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>URL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #URL
   * @model
   * @generated
   * @ordered
   */
  public static final int URL_VALUE = 10;

  /**
   * The '<em><b>Image</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Image</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMAGE
   * @model name="Image"
   * @generated
   * @ordered
   */
  public static final int IMAGE_VALUE = 11;

  /**
   * The '<em><b>XML</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>XML</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XML
   * @model
   * @generated
   * @ordered
   */
  public static final int XML_VALUE = 12;

  /**
   * The '<em><b>Binary</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Binary</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BINARY
   * @model name="Binary"
   * @generated
   * @ordered
   */
  public static final int BINARY_VALUE = 13;

  /**
   * An array of all the '<em><b>Attribute Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AttributeType[] VALUES_ARRAY =
    new AttributeType[]
    {
      INTEGER,
      DECIMAL,
      BOOLEAN,
      CURRENCY,
      DATE,
      TIME,
      DATETIME,
      STRING,
      TEXT,
      REGEX,
      URL,
      IMAGE,
      XML,
      BINARY,
    };

  /**
   * A public read-only list of all the '<em><b>Attribute Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AttributeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Attribute Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AttributeType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributeType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AttributeType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributeType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static AttributeType get(int value)
  {
    switch (value)
    {
      case INTEGER_VALUE: return INTEGER;
      case DECIMAL_VALUE: return DECIMAL;
      case BOOLEAN_VALUE: return BOOLEAN;
      case CURRENCY_VALUE: return CURRENCY;
      case DATE_VALUE: return DATE;
      case TIME_VALUE: return TIME;
      case DATETIME_VALUE: return DATETIME;
      case STRING_VALUE: return STRING;
      case TEXT_VALUE: return TEXT;
      case REGEX_VALUE: return REGEX;
      case URL_VALUE: return URL;
      case IMAGE_VALUE: return IMAGE;
      case XML_VALUE: return XML;
      case BINARY_VALUE: return BINARY;
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
  private AttributeType(int value, String name, String literal)
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
  
} //AttributeType
