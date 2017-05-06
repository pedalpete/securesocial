
package securesocial.views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object inputFieldConstructor extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[views.html.helper.FieldElements,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(elements: views.html.helper.FieldElements):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.api.i18n._

import views.html.helper._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*5.1*/("""
<div class="control-group """),_display_(Seq[Any](/*6.28*/elements/*6.36*/.args.get('_class))),format.raw/*6.54*/(""" """),_display_(Seq[Any](/*6.56*/if(elements.hasErrors)/*6.78*/ {_display_(Seq[Any](format.raw/*6.80*/("""error""")))})),format.raw/*6.86*/("""" id=""""),_display_(Seq[Any](/*6.93*/elements/*6.101*/.args.get('_id).getOrElse(elements.id + "_field"))),format.raw/*6.150*/("""">
    <label class="control-label" for=""""),_display_(Seq[Any](/*7.40*/elements/*7.48*/.id)),format.raw/*7.51*/("""">"""),_display_(Seq[Any](/*7.54*/elements/*7.62*/.label(elements.lang))),format.raw/*7.83*/("""</label>
    <div class="controls">
        """),_display_(Seq[Any](/*9.10*/elements/*9.18*/.input)),format.raw/*9.24*/("""
	"""),_display_(Seq[Any](/*10.3*/if( elements.hasErrors )/*10.27*/ {_display_(Seq[Any](format.raw/*10.29*/("""
            <span class="help-inline">"""),_display_(Seq[Any](/*11.40*/elements/*11.48*/.errors(elements.lang).mkString(", "))),format.raw/*11.85*/("""</span>
        """)))}/*12.11*/else/*12.16*/{_display_(Seq[Any](format.raw/*12.17*/("""
            <span class="help-block">"""),_display_(Seq[Any](/*13.39*/elements/*13.47*/.infos(elements.lang).mkString(", "))),format.raw/*13.83*/("""</span>
        """)))})),format.raw/*14.10*/("""
    </div>
</div>
"""))}
    }
    
    def render(elements:views.html.helper.FieldElements): play.api.templates.HtmlFormat.Appendable = apply(elements)
    
    def f:((views.html.helper.FieldElements) => play.api.templates.HtmlFormat.Appendable) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:25 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/inputFieldConstructor.scala.html
                    HASH: 707d9f76f39be4c1fc2b522430f15743b90a8eb7
                    MATRIX: 610->1|798->44|826->98|889->126|905->134|944->152|981->154|1011->176|1050->178|1087->184|1129->191|1146->199|1217->248|1294->290|1310->298|1334->301|1372->304|1388->312|1430->333|1510->378|1526->386|1553->392|1591->395|1624->419|1664->421|1740->461|1757->469|1816->506|1852->524|1865->529|1904->530|1979->569|1996->577|2054->613|2103->630
                    LINES: 19->1|25->1|27->5|28->6|28->6|28->6|28->6|28->6|28->6|28->6|28->6|28->6|28->6|29->7|29->7|29->7|29->7|29->7|29->7|31->9|31->9|31->9|32->10|32->10|32->10|33->11|33->11|33->11|34->12|34->12|34->12|35->13|35->13|35->13|36->14
                    -- GENERATED --
                */
            