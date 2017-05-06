
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[scala.Tuple2[String, String]],Option[String],RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[(String,String)], errorMsg: Option[String] = None)(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import securesocial.core.Registry

import securesocial.core.AuthenticationMethod._

import securesocial.core.providers.UsernamePasswordProvider.UsernamePassword


Seq[Any](format.raw/*1.102*/("""

"""),format.raw/*7.1*/("""


"""),_display_(Seq[Any](/*10.2*/main(Messages("securesocial.login.title"))/*10.44*/ {_display_(Seq[Any](format.raw/*10.46*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*12.14*/Messages("securesocial.login.title"))),format.raw/*12.50*/("""</h1>
    </div>

    """),_display_(Seq[Any](/*15.6*/errorMsg/*15.14*/.map/*15.18*/ { msg =>_display_(Seq[Any](format.raw/*15.27*/("""
        <div class="alert alert-error">
            """),_display_(Seq[Any](/*17.14*/Messages(msg))),format.raw/*17.27*/("""
        </div>
    """)))})),format.raw/*19.6*/("""

    """),_display_(Seq[Any](/*21.6*/request/*21.13*/.flash.get("success").map/*21.38*/ { msg =>_display_(Seq[Any](format.raw/*21.47*/("""
        <div class="alert alert-info">
            """),_display_(Seq[Any](/*23.14*/msg)),format.raw/*23.17*/("""
        </div>
    """)))})),format.raw/*25.6*/("""

    """),_display_(Seq[Any](/*27.6*/request/*27.13*/.flash.get("error").map/*27.36*/ { msg =>_display_(Seq[Any](format.raw/*27.45*/("""
        <div class="alert alert-error">
            """),_display_(Seq[Any](/*29.14*/msg)),format.raw/*29.17*/("""
        </div>
    """)))})),format.raw/*31.6*/("""


"""),_display_(Seq[Any](/*34.2*/defining( Registry.providers.all.values.filter( _.id != UsernamePassword) )/*34.77*/ { externalProviders =>_display_(Seq[Any](format.raw/*34.100*/("""

        """),_display_(Seq[Any](/*36.10*/if( externalProviders.size > 0 )/*36.42*/ {_display_(Seq[Any](format.raw/*36.44*/("""
            <div class="clearfix">
                <p>"""),_display_(Seq[Any](/*38.21*/Messages("securesocial.login.instructions"))),format.raw/*38.64*/("""</p>
                <p>
                    """),_display_(Seq[Any](/*40.22*/for(p <- externalProviders) yield /*40.49*/ {_display_(Seq[Any](format.raw/*40.51*/("""
                        """),_display_(Seq[Any](/*41.26*/provider(p.id))),format.raw/*41.40*/("""
                    """)))})),format.raw/*42.22*/("""
                </p>
            </div>
        """)))})),format.raw/*45.10*/("""

        """),_display_(Seq[Any](/*47.10*/Registry/*47.18*/.providers.get(UsernamePassword).map/*47.54*/ { up =>_display_(Seq[Any](format.raw/*47.62*/("""
            <div class="clearfix">
                """),_display_(Seq[Any](/*49.18*/if( externalProviders.size > 0 )/*49.50*/ {_display_(Seq[Any](format.raw/*49.52*/("""
                    <p>"""),_display_(Seq[Any](/*50.25*/Messages("securesocial.login.useEmailAndPassword"))),format.raw/*50.75*/("""</p>
                """)))}/*51.19*/else/*51.24*/{_display_(Seq[Any](format.raw/*51.25*/("""
                    <p>"""),_display_(Seq[Any](/*52.25*/Messages("securesocial.login.useEmailAndPasswordOnly"))),format.raw/*52.79*/("""</p>
                """)))})),format.raw/*53.18*/("""

               """),_display_(Seq[Any](/*55.17*/provider("userpass", Some(loginForm)))),format.raw/*55.54*/("""
            </div>
        """)))})),format.raw/*57.10*/("""
    """)))})),format.raw/*58.6*/("""
""")))})))}
    }
    
    def render(loginForm:Form[scala.Tuple2[String, String]],errorMsg:Option[String],request:RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(loginForm,errorMsg)(request)
    
    def f:((Form[scala.Tuple2[String, String]],Option[String]) => (RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (loginForm,errorMsg) => (request) => apply(loginForm,errorMsg)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:25 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/login.scala.html
                    HASH: c1a57565688c87665db058079e52704676dfa2a9
                    MATRIX: 626->1|999->101|1027->282|1066->286|1117->328|1157->330|1237->374|1295->410|1353->433|1370->441|1383->445|1430->454|1520->508|1555->521|1607->542|1649->549|1665->556|1699->581|1746->590|1835->643|1860->646|1912->667|1954->674|1970->681|2002->704|2049->713|2139->767|2164->770|2216->791|2255->795|2339->870|2401->893|2448->904|2489->936|2529->938|2621->994|2686->1037|2768->1083|2811->1110|2851->1112|2913->1138|2949->1152|3003->1174|3085->1224|3132->1235|3149->1243|3194->1279|3240->1287|3329->1340|3370->1372|3410->1374|3471->1399|3543->1449|3584->1472|3597->1477|3636->1478|3697->1503|3773->1557|3827->1579|3881->1597|3940->1634|4001->1663|4038->1669
                    LINES: 19->1|29->1|31->7|34->10|34->10|34->10|36->12|36->12|39->15|39->15|39->15|39->15|41->17|41->17|43->19|45->21|45->21|45->21|45->21|47->23|47->23|49->25|51->27|51->27|51->27|51->27|53->29|53->29|55->31|58->34|58->34|58->34|60->36|60->36|60->36|62->38|62->38|64->40|64->40|64->40|65->41|65->41|66->42|69->45|71->47|71->47|71->47|71->47|73->49|73->49|73->49|74->50|74->50|75->51|75->51|75->51|76->52|76->52|77->53|79->55|79->55|81->57|82->58
                    -- GENERATED --
                */
            