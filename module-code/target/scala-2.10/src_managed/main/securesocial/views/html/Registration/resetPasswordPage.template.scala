
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
object resetPasswordPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[scala.Tuple2[String, String]],String,RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(resetForm:Form[(String, String)], token: String)(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import securesocial.core.IdentityProvider

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(securesocial.views.html.inputFieldConstructor.f) }};
Seq[Any](format.raw/*1.84*/("""
"""),format.raw/*4.99*/("""

"""),_display_(Seq[Any](/*6.2*/securesocial/*6.14*/.views.html.main( Messages("securesocial.password.title") )/*6.73*/ {_display_(Seq[Any](format.raw/*6.75*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*8.14*/Messages("securesocial.password.title"))),format.raw/*8.53*/("""</h1>
    </div>

    """),_display_(Seq[Any](/*11.6*/request/*11.13*/.flash.get("error").map/*11.36*/ { msg =>_display_(Seq[Any](format.raw/*11.45*/("""
        <div class="alert alert-error">
            """),_display_(Seq[Any](/*13.14*/Messages(msg))),format.raw/*13.27*/("""
        </div>
    """)))})),format.raw/*15.6*/("""

    <form action=""""),_display_(Seq[Any](/*17.20*/securesocial/*17.32*/.core.providers.utils.RoutesHelper.handleResetPassword(token).absoluteURL(IdentityProvider.sslEnabled))),format.raw/*17.134*/(""""
          class="form-horizontal"
          autocomplete="off"
          method="POST"
    >
        <fieldset>
            """),_display_(Seq[Any](/*23.14*/helper/*23.20*/.inputPassword(
            resetForm("password.password1"),
            '_label -> Messages("securesocial.signup.password1"),
            'class -> "input-xlarge"
            ))),format.raw/*27.14*/("""

            """),_display_(Seq[Any](/*29.14*/helper/*29.20*/.inputPassword(
            resetForm("password.password2"),
            '_label -> Messages("securesocial.signup.password2"),
            '_error -> resetForm.error("password"),
            'class -> "input-xlarge"
            ))),format.raw/*34.14*/("""

            <div class="form-actions">
                <button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*37.64*/Messages("securesocial.password.reset"))),format.raw/*37.103*/("""</button>
            </div>

        </fieldset>
    </form>
""")))})),format.raw/*42.2*/("""


"""))}
    }
    
    def render(resetForm:Form[scala.Tuple2[String, String]],token:String,request:RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(resetForm,token)(request)
    
    def f:((Form[scala.Tuple2[String, String]],String) => (RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (resetForm,token) => (request) => apply(resetForm,token)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:25 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/Registration/resetPasswordPage.scala.html
                    HASH: 480a8cf948c76e28d990f2317559b8564b38ff38
                    MATRIX: 643->1|870->145|902->169|1005->83|1033->242|1070->245|1090->257|1157->316|1196->318|1275->362|1335->401|1393->424|1409->431|1441->454|1488->463|1578->517|1613->530|1665->551|1722->572|1743->584|1868->686|2031->813|2046->819|2245->996|2296->1011|2311->1017|2562->1246|2702->1350|2764->1389|2858->1452
                    LINES: 19->1|24->4|24->4|25->1|26->4|28->6|28->6|28->6|28->6|30->8|30->8|33->11|33->11|33->11|33->11|35->13|35->13|37->15|39->17|39->17|39->17|45->23|45->23|49->27|51->29|51->29|56->34|59->37|59->37|64->42
                    -- GENERATED --
                */
            