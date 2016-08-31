/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Glossary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.PackageGlossary#getGlossaryTerms <em>Glossary Terms</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getPackageGlossary()
 * @model
 * @generated
 */
public interface PackageGlossary extends PackageAbstract
{
  /**
   * Returns the value of the '<em><b>Glossary Terms</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.GlossaryTerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Glossary Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Glossary Terms</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageGlossary_GlossaryTerms()
   * @model containment="true"
   * @generated
   */
  EList<GlossaryTerm> getGlossaryTerms();

} // PackageGlossary
