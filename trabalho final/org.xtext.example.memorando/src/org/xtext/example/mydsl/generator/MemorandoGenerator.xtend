/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.memorando.Model
import javax.swing.text.html.parser.Entity
import org.xtext.example.mydsl.memorando.Memorando

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MemorandoGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(e: resource.allContents.toIterable.filter(typeof(Model))) {
			var int i = 1;
			for(x: e.getMemorandos()){
				fsa.generateFile('memorando' + i + '.html', toHtml(x))
				i = i + 1;
			}
		}
			//fsa.generateFile('memorando.html', toHtml(resource.contents.head as Model))
		
	}
	
	def toHtml(Memorando c) '''
		<!DOCTYPE html>
		<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<meta http-equiv="Content-Language" content="en-us">
			<title>Memorando</title>
			<style>
				body {margin-top: 0px;margin-left: 0px;}
				#page_1 {position:relative; overflow: hidden;margin: 40px 0px 52px 32px;padding: 0px;border: none;width: 761px;}
				#page_1 #p1dimg1 {position:absolute;top:0px;left:80px;z-index:-1;width:400px;height:57px;}
				#page_1 #p1dimg1 #p1img1 {width:400px;height:57px;}
				#page_2 {position:relative; overflow: hidden;margin: 40px 0px 85px 111px;padding: 0px;border: none;width: 682px;}
				#page_2 #id2_1 {border:none;margin: 0px 0px 0px 0px;padding: 0px;border:none;width: 682px;overflow: hidden;}
				#page_2 #id2_2 {border:none;margin: 20px 0px 0px 525px;padding: 0px;border:none;width: 157px;overflow: hidden;}
				.dclr {clear:both;float:none;height:1px;margin:0px;padding:0px;overflow:hidden;}
				.ft0{font: bold 12px 'Times New Roman';line-height: 15px;color:white}
				.ft1{font: bold 14px 'Times New Roman';line-height: 17px;}
				.ft2{font: 14px 'Times New Roman';line-height: 16px;}
				.ft3{font: 14px 'Times New Roman';line-height: 20px;}
				.ft4{font: 12px 'Times New Roman';line-height: 15px;}
				.ft5{font: 8px 'Arial';line-height: 10px;}
				.ft6{font: 6px 'Arial';line-height: 6px;}
				.ft7{font: 1px 'Times New Roman';line-height: 1px;}
				.ft8{font: 12px 'Arial';line-height: 15px;}
				.ft9{font: 11px 'Arial';line-height: 14px;}
				.ft10{font: 1px 'Arial';line-height: 6px;}
				.ft11{font: 10px 'Arial';line-height: 13px;}
				.ft12{font: 1px 'Arial';line-height: 1px;}
				.ft13{font: 1px 'Arial';line-height: 2px;}
				.ft14{font: 9px 'Arial';line-height: 12px;}
				.ft15{font: 7px 'Arial';line-height: 7px;}
				
				.p0{text-align: left;padding-left: 144px;margin-top: 57px;margin-bottom: 0px;}
				.p1{text-align: left;padding-left: 80px;margin-top: 27px;margin-bottom: 0px;}
				.p2{text-align: left;padding-left: 498px;margin-top: 58px;margin-bottom: 0px;}
				.p3{text-align: left;padding-left: 80px;margin-top: 23px;margin-bottom: 0px;}
				.p4{text-align: left;padding-left: 80px;margin-top: 16px;margin-bottom: 0px;}
				.p5{text-align: justify;padding-left: 80px;padding-right: 65px;margin-top: 34px;margin-bottom: 0px;text-indent: 151px;}
				.p6{text-align: left;padding-left: 80px;margin-top: 21px;margin-bottom: 0px;}
				.p7{text-align: left;padding-left: 322px;margin-top: 23px;margin-bottom: 0px;}
				.p8{text-align: left;padding-left: 314px;margin-top: 7px;margin-bottom: 0px;}
				.p9{text-align: left;padding-left: 328px;margin-top: 10px;margin-bottom: 0px;}
				.p10{text-align: left;padding-left: 295px;margin-top: 9px;margin-bottom: 0px;}
				.p11{text-align: left;margin-top: 0px;margin-bottom: 0px;white-space: nowrap;}
				.p12{text-align: left;padding-left: 1px;margin-top: 0px;margin-bottom: 0px;}
				.p13{text-align: left;padding-left: 1px;margin-top: 26px;margin-bottom: 0px;}
				.p14{text-align: left;padding-left: 1px;margin-top: 13px;margin-bottom: 0px;}
				.p15{text-align: left;padding-left: 9px;margin-top: 0px;margin-bottom: 0px;white-space: nowrap;}
				.p16{text-align: left;padding-left: 8px;margin-top: 0px;margin-bottom: 0px;white-space: nowrap;}
				.p17{text-align: left;padding-left: 7px;margin-top: 0px;margin-bottom: 0px;white-space: nowrap;}
				.p18{text-align: left;padding-left: 5px;margin-top: 0px;margin-bottom: 0px;white-space: nowrap;}
				.p19{text-align: left;margin-top: 0px;margin-bottom: 0px;}
				
				.td0{padding: 0px;margin: 0px;width: 554px;vertical-align: bottom;}
				.td1{padding: 0px;margin: 0px;width: 174px;vertical-align: bottom;}
				.td2{border-left: #000000 1px solid;border-right: #000000 1px solid;border-top: #000000 1px solid;padding: 0px;margin: 0px;width: 108px;vertical-align: bottom;}
				.td3{border-right: #000000 1px solid;border-top: #000000 1px solid;padding: 0px;margin: 0px;width: 85px;vertical-align: bottom;}
				.td4{border-right: #000000 1px solid;border-top: #000000 1px solid;padding: 0px;margin: 0px;width: 229px;vertical-align: bottom;}
				.td5{border-right: #000000 1px solid;border-top: #000000 1px solid;padding: 0px;margin: 0px;width: 182px;vertical-align: bottom;}
				.td6{border-left: #000000 1px solid;border-right: #000000 1px solid;border-bottom: #000000 1px solid;padding: 0px;margin: 0px;width: 108px;vertical-align: bottom;}
				.td7{border-right: #000000 1px solid;border-bottom: #000000 1px solid;padding: 0px;margin: 0px;width: 85px;vertical-align: bottom;}
				.td8{border-right: #000000 1px solid;border-bottom: #000000 1px solid;padding: 0px;margin: 0px;width: 229px;vertical-align: bottom;}
				.td9{border-right: #000000 1px solid;border-bottom: #000000 1px solid;padding: 0px;margin: 0px;width: 182px;vertical-align: bottom;}
				.td10{border-left: #000000 1px solid;border-right: #000000 1px solid;padding: 0px;margin: 0px;width: 108px;vertical-align: bottom;}
				.td11{border-right: #000000 1px solid;padding: 0px;margin: 0px;width: 85px;vertical-align: bottom;}
				.td12{border-right: #000000 1px solid;padding: 0px;margin: 0px;width: 229px;vertical-align: bottom;}
				.td13{border-right: #000000 1px solid;padding: 0px;margin: 0px;width: 182px;vertical-align: bottom;}
				
				.tr0{height: 15px;}
				.tr1{height: 12px;}
				.tr2{height: 21px;}
				.tr3{height: 6px;}
				.tr4{height: 17px;}
				.tr5{height: 14px;}
				.tr6{height: 13px;}
				.tr7{height: 2px;}
				.tr8{height: 28px;}
				.tr9{height: 42px;}
				
				.t0{width: 728px;margin-top: 339px;font: 8px 'Arial';}
				.t1{width: 608px;margin-top: 8px;font: 10px 'Arial';}
			</style>
		</head>
		<body>
			
			<DIV id="page_1">
			<DIV id="p1dimg1">
			<IMG src="data:image/png;base64,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" id="p1img1"></DIV>
			
			<DIV class="dclr"></DIV>
			<P class="p0 ft0">.</P>
			<P class="p1 ft1">Memorando n� �c.numero�/ �c.ano� - �c.setorRemetente�</P>
			<P class="p2 ft1">�c.cidade� (�c.estado�), �c.dia� de �c.mes� de �c.ano�.</P>
			<P class="p3 ft2">Ao Sr �c.cargoDestinatario� da �c.setorDestinatario�</P>
			<P class="p4 ft1"><SPAN class="ft2">Assunto: </SPAN>�c.assunto�</P>
			<P class="p3 ft2">Destinos: 
			�FOR d : c.destinos�
			�d.destino�
			�ENDFOR�
			</P>
			�FOR e : c.paragrafos�
			<P class="p5 ft3">
			�e.paragrafo�
			</P>
			�ENDFOR�
			<P class="p6 ft2">Atenciosamente,</P>
			<P class="p7 ft2">�c.remetente�</P>
			<P class="p8 ft4">�c.cargoRemetente�</P>
			<P class="p9 ft4">C�digo de autentica��o</P>
			<P class="p10 ft4">ae176ead9e8ffea1ede08a4347203ecd</P>
			</DIV>
			</DIV>
			
		</body>
		</html>
	'''
}
