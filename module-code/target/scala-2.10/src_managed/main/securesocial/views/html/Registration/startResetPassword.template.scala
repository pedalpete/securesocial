
package securesocial.views.html.Registration

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
object startResetPassword extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[String],RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(startForm:Form[String])(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import securesocial.core.IdentityProvider

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(securesocial.views.html.inputFieldConstructor.f) }};
Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*4.99*/("""

"""),_display_(Seq[Any](/*6.2*/securesocial/*6.14*/.views.html.main( Messages("securesocial.password.title") )/*6.73*/ {_display_(Seq[Any](format.raw/*6.75*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*8.14*/Messages("securesocial.password.title"))),format.raw/*8.53*/("""</h1>
    </div>

    """),_display_(Seq[Any](/*11.6*/request/*11.13*/.flash.get("error").map/*11.36*/ { msg =>_display_(Seq[Any](format.raw/*11.45*/("""
    <div class="alert alert-error">
        """),_display_(Seq[Any](/*13.10*/Messages(msg))),format.raw/*13.23*/("""
    </div>
    """)))})),format.raw/*15.6*/("""

    <form action=""""),_display_(Seq[Any](/*17.20*/securesocial/*17.32*/.core.providers.utils.RoutesHelper.handleStartResetPassword().absoluteURL(IdentityProvider.sslEnabled))),format.raw/*17.134*/(""""
          class="form-horizontal"
          autocomplete="off"
          method="POST"
    >
        <fieldset>
            """),_display_(Seq[Any](/*23.14*/helper/*23.20*/.inputText(
            startForm("email"),
            '_label -> Messages("securesocial.signup.email1"),
            'class -> "input-xlarge"
            ))),format.raw/*27.14*/("""

            <div class="form-actions">
                <button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*30.64*/Messages("securesocial.password.reset"))),format.raw/*30.103*/("""</button>
                <a class="btn" href=""""),_display_(Seq[Any](/*31.39*/securesocial/*31.51*/.core.providers.utils.RoutesHelper.login())),format.raw/*31.93*/("""">"""),_display_(Seq[Any](/*31.96*/Messages("securesocial.signup.cancel"))),format.raw/*31.134*/("""</a>
            </div>

        </fieldset>
    </form>
""")))})))}
    }
    
    def render(startForm:Form[String],request:RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(startForm)(request)
    
    def f:((Form[String]) => (RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (startForm) => (request) => apply(startForm)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:26 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/Registration/startResetPassword.scala.html
                    HASH: 0becbb903a9e375da5e13b234b0944228d71292d
                    MATRIX: 615->1|817->120|849->144|952->58|980->217|1017->220|1037->232|1104->291|1143->293|1222->337|1282->376|1340->399|1356->406|1388->429|1435->438|1517->484|1552->497|1600->514|1657->535|1678->547|1803->649|1966->776|1981->782|2160->939|2300->1043|2362->1082|2446->1130|2467->1142|2531->1184|2570->1187|2631->1225
                    LINES: 19->1|24->4|24->4|25->1|26->4|28->6|28->6|28->6|28->6|30->8|30->8|33->11|33->11|33->11|33->11|35->13|35->13|37->15|39->17|39->17|39->17|45->23|45->23|49->27|52->30|52->30|53->31|53->31|53->31|53->31|53->31
                    -- GENERATED --
                */
            