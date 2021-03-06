/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.profissional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.profissional.ProfissionalFactory
 * @model kind="package"
 * @generated
 */
public interface ProfissionalPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "profissional";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/Profissional";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "profissional";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProfissionalPackage eINSTANCE = org.xtext.example.mydsl.profissional.impl.ProfissionalPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.profissional.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.profissional.impl.ModelImpl
   * @see org.xtext.example.mydsl.profissional.impl.ProfissionalPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Profissional</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROFISSIONAL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.profissional.impl.PessoaImpl <em>Pessoa</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.profissional.impl.PessoaImpl
   * @see org.xtext.example.mydsl.profissional.impl.ProfissionalPackageImpl#getPessoa()
   * @generated
   */
  int PESSOA = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PESSOA__NAME = 0;

  /**
   * The feature id for the '<em><b>Empresa</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PESSOA__EMPRESA = 1;

  /**
   * The number of structural features of the '<em>Pessoa</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PESSOA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.profissional.impl.EmpresaImpl <em>Empresa</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.profissional.impl.EmpresaImpl
   * @see org.xtext.example.mydsl.profissional.impl.ProfissionalPackageImpl#getEmpresa()
   * @generated
   */
  int EMPRESA = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPRESA__NAME = 0;

  /**
   * The feature id for the '<em><b>Linguagens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPRESA__LINGUAGENS = 1;

  /**
   * The number of structural features of the '<em>Empresa</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPRESA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.profissional.impl.LinguagensImpl <em>Linguagens</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.profissional.impl.LinguagensImpl
   * @see org.xtext.example.mydsl.profissional.impl.ProfissionalPackageImpl#getLinguagens()
   * @generated
   */
  int LINGUAGENS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINGUAGENS__NAME = 0;

  /**
   * The number of structural features of the '<em>Linguagens</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINGUAGENS_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.profissional.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.profissional.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.profissional.Model#getProfissional <em>Profissional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Profissional</em>'.
   * @see org.xtext.example.mydsl.profissional.Model#getProfissional()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Profissional();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.profissional.Pessoa <em>Pessoa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pessoa</em>'.
   * @see org.xtext.example.mydsl.profissional.Pessoa
   * @generated
   */
  EClass getPessoa();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.profissional.Pessoa#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.profissional.Pessoa#getName()
   * @see #getPessoa()
   * @generated
   */
  EAttribute getPessoa_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.profissional.Pessoa#getEmpresa <em>Empresa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empresa</em>'.
   * @see org.xtext.example.mydsl.profissional.Pessoa#getEmpresa()
   * @see #getPessoa()
   * @generated
   */
  EReference getPessoa_Empresa();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.profissional.Empresa <em>Empresa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empresa</em>'.
   * @see org.xtext.example.mydsl.profissional.Empresa
   * @generated
   */
  EClass getEmpresa();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.profissional.Empresa#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.profissional.Empresa#getName()
   * @see #getEmpresa()
   * @generated
   */
  EAttribute getEmpresa_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.profissional.Empresa#getLinguagens <em>Linguagens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Linguagens</em>'.
   * @see org.xtext.example.mydsl.profissional.Empresa#getLinguagens()
   * @see #getEmpresa()
   * @generated
   */
  EReference getEmpresa_Linguagens();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.profissional.Linguagens <em>Linguagens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linguagens</em>'.
   * @see org.xtext.example.mydsl.profissional.Linguagens
   * @generated
   */
  EClass getLinguagens();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.profissional.Linguagens#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.profissional.Linguagens#getName()
   * @see #getLinguagens()
   * @generated
   */
  EAttribute getLinguagens_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProfissionalFactory getProfissionalFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.profissional.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.profissional.impl.ModelImpl
     * @see org.xtext.example.mydsl.profissional.impl.ProfissionalPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Profissional</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROFISSIONAL = eINSTANCE.getModel_Profissional();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.profissional.impl.PessoaImpl <em>Pessoa</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.profissional.impl.PessoaImpl
     * @see org.xtext.example.mydsl.profissional.impl.ProfissionalPackageImpl#getPessoa()
     * @generated
     */
    EClass PESSOA = eINSTANCE.getPessoa();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PESSOA__NAME = eINSTANCE.getPessoa_Name();

    /**
     * The meta object literal for the '<em><b>Empresa</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PESSOA__EMPRESA = eINSTANCE.getPessoa_Empresa();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.profissional.impl.EmpresaImpl <em>Empresa</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.profissional.impl.EmpresaImpl
     * @see org.xtext.example.mydsl.profissional.impl.ProfissionalPackageImpl#getEmpresa()
     * @generated
     */
    EClass EMPRESA = eINSTANCE.getEmpresa();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPRESA__NAME = eINSTANCE.getEmpresa_Name();

    /**
     * The meta object literal for the '<em><b>Linguagens</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMPRESA__LINGUAGENS = eINSTANCE.getEmpresa_Linguagens();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.profissional.impl.LinguagensImpl <em>Linguagens</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.profissional.impl.LinguagensImpl
     * @see org.xtext.example.mydsl.profissional.impl.ProfissionalPackageImpl#getLinguagens()
     * @generated
     */
    EClass LINGUAGENS = eINSTANCE.getLinguagens();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINGUAGENS__NAME = eINSTANCE.getLinguagens_Name();

  }

} //ProfissionalPackage
