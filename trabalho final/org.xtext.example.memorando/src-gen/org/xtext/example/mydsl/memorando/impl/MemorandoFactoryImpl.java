/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.memorando.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.memorando.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemorandoFactoryImpl extends EFactoryImpl implements MemorandoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MemorandoFactory init()
  {
    try
    {
      MemorandoFactory theMemorandoFactory = (MemorandoFactory)EPackage.Registry.INSTANCE.getEFactory(MemorandoPackage.eNS_URI);
      if (theMemorandoFactory != null)
      {
        return theMemorandoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MemorandoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemorandoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MemorandoPackage.MODEL: return createModel();
      case MemorandoPackage.MEMORANDO: return createMemorando();
      case MemorandoPackage.DESTINO: return createDestino();
      case MemorandoPackage.PARAGRAFO: return createParagrafo();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Memorando createMemorando()
  {
    MemorandoImpl memorando = new MemorandoImpl();
    return memorando;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Destino createDestino()
  {
    DestinoImpl destino = new DestinoImpl();
    return destino;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Paragrafo createParagrafo()
  {
    ParagrafoImpl paragrafo = new ParagrafoImpl();
    return paragrafo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MemorandoPackage getMemorandoPackage()
  {
    return (MemorandoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MemorandoPackage getPackage()
  {
    return MemorandoPackage.eINSTANCE;
  }

} //MemorandoFactoryImpl