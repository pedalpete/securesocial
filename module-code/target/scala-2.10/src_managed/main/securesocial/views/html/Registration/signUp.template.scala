
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
object signUp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[securesocial.controllers.Registration.RegistrationInfo],String,RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signUpForm:Form[securesocial.controllers.Registration.RegistrationInfo], token: String)(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import securesocial.core.providers.UsernamePasswordProvider

import securesocial.core.IdentityProvider

import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(securesocial.views.html.inputFieldConstructor.f) }};
Seq[Any](format.raw/*1.123*/("""
"""),format.raw/*5.99*/("""

"""),_display_(Seq[Any](/*7.2*/securesocial/*7.14*/.views.html.main( Messages("securesocial.signup.title") )/*7.71*/ {_display_(Seq[Any](format.raw/*7.73*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*9.14*/Messages("securesocial.signup.title"))),format.raw/*9.51*/("""</h1>
    </div>

    """),_display_(Seq[Any](/*12.6*/request/*12.13*/.flash.get("error").map/*12.36*/ { msg =>_display_(Seq[Any](format.raw/*12.45*/("""
        <div class="alert alert-error">
            """),_display_(Seq[Any](/*14.14*/msg)),format.raw/*14.17*/("""
        </div>
    """)))})),format.raw/*16.6*/("""

    <form action=""""),_display_(Seq[Any](/*18.20*/securesocial/*18.32*/.core.providers.utils.RoutesHelper.handleSignUp(token).absoluteURL(IdentityProvider.sslEnabled))),format.raw/*18.127*/(""""
          class="form-horizontal"
          autocomplete= "off"
          method="POST"
    >
        <fieldset>
            """),_display_(Seq[Any](/*24.14*/if( UsernamePasswordProvider.withUserNameSupport )/*24.64*/ {_display_(Seq[Any](format.raw/*24.66*/("""
                """),_display_(Seq[Any](/*25.18*/helper/*25.24*/.inputText(
                    signUpForm("userName"),
                    '_label -> Messages("securesocial.signup.username"),
                    'class -> "input-xlarge"
                ))),format.raw/*29.18*/("""
            """)))})),format.raw/*30.14*/("""

            """),_display_(Seq[Any](/*32.14*/helper/*32.20*/.inputText(
                signUpForm("firstName"),
                '_label -> Messages("securesocial.signup.firstName"),
                'class -> "input-xlarge"
            ))),format.raw/*36.14*/("""

            """),_display_(Seq[Any](/*38.14*/helper/*38.20*/.inputText(
                signUpForm("lastName"),
                '_label -> Messages("securesocial.signup.lastName"),
                'class -> "input-xlarge"
            ))),format.raw/*42.14*/("""

            """),_display_(Seq[Any](/*44.14*/helper/*44.20*/.inputPassword(
                signUpForm("password.password1"),
                '_label -> Messages("securesocial.signup.password1"),
                'class -> "input-xlarge"
            ))),format.raw/*48.14*/("""

            """),_display_(Seq[Any](/*50.14*/helper/*50.20*/.inputPassword(
                signUpForm("password.password2"),
                '_label -> Messages("securesocial.signup.password2"),
                '_error -> signUpForm.error("password"),
                'class -> "input-xlarge"
            ))),format.raw/*55.14*/("""

            <div class="form-actions">
                <button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*58.64*/Messages("securesocial.signup.createAccount"))),format.raw/*58.109*/("""</button>
                <a class="btn" href=""""),_display_(Seq[Any](/*59.39*/securesocial/*59.51*/.core.providers.utils.RoutesHelper.login())),format.raw/*59.93*/("""">"""),_display_(Seq[Any](/*59.96*/Messages("securesocial.signup.cancel"))),format.raw/*59.134*/("""</a>
            </div>
        </fieldset>
    </form>
""")))})))}
    }
    
    def render(signUpForm:Form[securesocial.controllers.Registration.RegistrationInfo],token:String,request:RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(signUpForm,token)(request)
    
    def f:((Form[securesocial.controllers.Registration.RegistrationInfo],String) => (RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (signUpForm,token) => (request) => apply(signUpForm,token)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:26 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/Registration/signUp.scala.html
                    HASH: 22e0f426eb5c79e102e7e1dd732c47a39d4722ee
                    MATRIX: 658->1|985->245|1017->269|1121->122|1149->342|1186->345|1206->357|1271->414|1310->416|1389->460|1447->497|1505->520|1521->527|1553->550|1600->559|1690->613|1715->616|1767->637|1824->658|1845->670|1963->765|2127->893|2186->943|2226->945|2280->963|2295->969|2508->1160|2554->1174|2605->1189|2620->1195|2819->1372|2870->1387|2885->1393|3082->1568|3133->1583|3148->1589|3360->1779|3411->1794|3426->1800|3695->2047|3835->2151|3903->2196|3987->2244|4008->2256|4072->2298|4111->2301|4172->2339
                    LINES: 19->1|26->5|26->5|27->1|28->5|30->7|30->7|30->7|30->7|32->9|32->9|35->12|35->12|35->12|35->12|37->14|37->14|39->16|41->18|41->18|41->18|47->24|47->24|47->24|48->25|48->25|52->29|53->30|55->32|55->32|59->36|61->38|61->38|65->42|67->44|67->44|71->48|73->50|73->50|78->55|81->58|81->58|82->59|82->59|82->59|82->59|82->59
                    -- GENERATED --
                */
            