
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
object startSignUp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[String],RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(startForm:Form[String])(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import securesocial.core.IdentityProvider

implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(securesocial.views.html.inputFieldConstructor.f) }};
Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*4.99*/("""

"""),_display_(Seq[Any](/*6.2*/securesocial/*6.14*/.views.html.main( Messages("securesocial.signup.title") )/*6.71*/ {_display_(Seq[Any](format.raw/*6.73*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*8.14*/Messages("securesocial.signup.title"))),format.raw/*8.51*/("""</h1>
    </div>

    """),_display_(Seq[Any](/*11.6*/request/*11.13*/.flash.get("error").map/*11.36*/ { msg =>_display_(Seq[Any](format.raw/*11.45*/("""
    <div class="alert alert-error">
        """),_display_(Seq[Any](/*13.10*/Messages(msg))),format.raw/*13.23*/("""
    </div>
    """)))})),format.raw/*15.6*/("""

    <form action=""""),_display_(Seq[Any](/*17.20*/securesocial/*17.32*/.core.providers.utils.RoutesHelper.handleStartSignUp().absoluteURL(IdentityProvider.sslEnabled))),format.raw/*17.127*/(""""
          class="form-horizontal"
          autocomplete="off" method="post"
    >
        <fieldset>
            """),_display_(Seq[Any](/*22.14*/helper/*22.20*/.inputText(
            startForm("email"),
            '_label -> Messages("securesocial.signup.email1"),
            'class -> "input-xlarge"
            ))),format.raw/*26.14*/("""

            <div class="form-actions">
                <button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*29.64*/Messages("securesocial.signup.createAccount"))),format.raw/*29.109*/("""</button>
                <a class="btn" href=""""),_display_(Seq[Any](/*30.39*/securesocial/*30.51*/.core.providers.utils.RoutesHelper.login())),format.raw/*30.93*/("""">"""),_display_(Seq[Any](/*30.96*/Messages("securesocial.signup.cancel"))),format.raw/*30.134*/("""</a>
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
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/Registration/startSignUp.scala.html
                    HASH: 05f1e032c5a78c048cdfd0e043e7a80cf7ef4b9c
                    MATRIX: 608->1|810->120|842->144|945->58|973->217|1010->220|1030->232|1095->289|1134->291|1213->335|1271->372|1329->395|1345->402|1377->425|1424->434|1506->480|1541->493|1589->510|1646->531|1667->543|1785->638|1938->755|1953->761|2132->918|2272->1022|2340->1067|2424->1115|2445->1127|2509->1169|2548->1172|2609->1210
                    LINES: 19->1|24->4|24->4|25->1|26->4|28->6|28->6|28->6|28->6|30->8|30->8|33->11|33->11|33->11|33->11|35->13|35->13|37->15|39->17|39->17|39->17|44->22|44->22|48->26|51->29|51->29|52->30|52->30|52->30|52->30|52->30
                    -- GENERATED --
                */
            