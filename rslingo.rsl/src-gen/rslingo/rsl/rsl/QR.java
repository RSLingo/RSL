/**
 */
package rslingo.rsl.rsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.QR#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.QR#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.QR#getMetric <em>Metric</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.QR#getValue <em>Value</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.QR#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getQR()
 * @model
 * @generated
 */
public interface QR extends Requirement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.QRType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.QRType
   * @see #setType(QRType)
   * @see rslingo.rsl.rsl.RslPackage#getQR_Type()
   * @model
   * @generated
   */
  QRType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.QR#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.QRType
   * @see #getType()
   * @generated
   */
  void setType(QRType value);

  /**
   * Returns the value of the '<em><b>Sub Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.QRSubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Type</em>' attribute.
   * @see rslingo.rsl.rsl.QRSubType
   * @see #setSubType(QRSubType)
   * @see rslingo.rsl.rsl.RslPackage#getQR_SubType()
   * @model
   * @generated
   */
  QRSubType getSubType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.QR#getSubType <em>Sub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Type</em>' attribute.
   * @see rslingo.rsl.rsl.QRSubType
   * @see #getSubType()
   * @generated
   */
  void setSubType(QRSubType value);

  /**
   * Returns the value of the '<em><b>Metric</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.Metric}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metric</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metric</em>' attribute.
   * @see rslingo.rsl.rsl.Metric
   * @see #setMetric(Metric)
   * @see rslingo.rsl.rsl.RslPackage#getQR_Metric()
   * @model
   * @generated
   */
  Metric getMetric();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.QR#getMetric <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metric</em>' attribute.
   * @see rslingo.rsl.rsl.Metric
   * @see #getMetric()
   * @generated
   */
  void setMetric(Metric value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see rslingo.rsl.rsl.RslPackage#getQR_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.QR#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Of</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Of</em>' reference.
   * @see #setPartOf(QR)
   * @see rslingo.rsl.rsl.RslPackage#getQR_PartOf()
   * @model
   * @generated
   */
  QR getPartOf();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.QR#getPartOf <em>Part Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Of</em>' reference.
   * @see #getPartOf()
   * @generated
   */
  void setPartOf(QR value);

} // QR
