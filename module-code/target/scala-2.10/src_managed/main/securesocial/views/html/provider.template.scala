
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
object provider extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Option[Form[scala.Tuple2[String, String]]],RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(providerId: String, loginForm: Option[Form[(String, String)]] = None)(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import securesocial.core.Registry

import securesocial.core.IdentityProvider

import securesocial.core.providers.UsernamePasswordProvider

import securesocial.core.AuthenticationMethod._

import securesocial.core.providers.utils.RoutesHelper

import play.api.{Logger, Play}

import helper._

import play.api.Play

implicit def /*12.2*/implicitFieldConstructor/*12.26*/ = {{ FieldConstructor(securesocial.views.html.inputFieldConstructor.f) }};
Seq[Any](format.raw/*1.105*/("""

"""),format.raw/*11.1*/("""
"""),format.raw/*12.99*/("""

"""),_display_(Seq[Any](/*14.2*/Registry/*14.10*/.providers.get(providerId).map/*14.40*/ { provider =>_display_(Seq[Any](format.raw/*14.54*/("""
            """),_display_(Seq[Any](/*15.14*/if( provider.authMethod == OAuth1 || provider.authMethod == OAuth2 )/*15.82*/ {_display_(Seq[Any](format.raw/*15.84*/("""
                """),_display_(Seq[Any](/*16.18*/defining( "securesocial/images/providers/%s.png".format(provider.id) )/*16.88*/ { imageUrl =>_display_(Seq[Any](format.raw/*16.102*/("""
                    <a href=""""),_display_(Seq[Any](/*17.31*/provider/*17.39*/.authenticationUrl)),format.raw/*17.57*/(""""> <img src=""""),_display_(Seq[Any](/*17.71*/RoutesHelper/*17.83*/.at(imageUrl))),format.raw/*17.96*/(""""/></a>
                """)))})),format.raw/*18.18*/("""
            """)))})),format.raw/*19.14*/("""

            """),_display_(Seq[Any](/*21.14*/if( provider.authMethod == UserPassword )/*21.55*/ {_display_(Seq[Any](format.raw/*21.57*/("""
                <form action = """"),_display_(Seq[Any](/*22.34*/securesocial/*22.46*/.core.providers.utils.RoutesHelper.authenticateByPost("userpass").absoluteURL(IdentityProvider.sslEnabled))),format.raw/*22.152*/(""""
                      class="form-horizontal" autocomplete="off" method="POST">
                    <fieldset>

                        """),_display_(Seq[Any](/*26.26*/if( UsernamePasswordProvider.withUserNameSupport )/*26.76*/ {_display_(Seq[Any](format.raw/*26.78*/("""
                            """),_display_(Seq[Any](/*27.30*/helper/*27.36*/.inputText(
                                loginForm.get("username"),
                                '_label -> Messages("securesocial.signup.username"),
                                'class -> "input-xlarge"
                            ))),format.raw/*31.30*/("""
                        """)))}/*32.27*/else/*32.32*/{_display_(Seq[Any](format.raw/*32.33*/("""
                            """),_display_(Seq[Any](/*33.30*/helper/*33.36*/.inputText(
                                loginForm.get("username"),
                                '_label -> Messages("securesocial.signup.email1"),
                                'class -> "input-xlarge"
                            ))),format.raw/*37.30*/("""
                        """)))})),format.raw/*38.26*/("""

                        """),_display_(Seq[Any](/*40.26*/helper/*40.32*/.inputPassword(
                            loginForm.get("password"),
                            '_label -> Messages("securesocial.signup.password1"),
                            'class -> "input-xlarge"
                        ))),format.raw/*44.26*/("""

                        <div class="form-actions">
                            <button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*47.76*/Messages("securesocial.login.title"))),format.raw/*47.112*/("""</button>
                        </div>
                        <div class="clearfix">
                            <a href=""""),_display_(Seq[Any](/*50.39*/securesocial/*50.51*/.core.providers.utils.RoutesHelper.startResetPassword())),format.raw/*50.106*/(""""><p>"""),_display_(Seq[Any](/*50.112*/Messages("securesocial.login.forgotPassword"))),format.raw/*50.157*/(""" </a></p>
                        </div>
                        """),_display_(Seq[Any](/*52.26*/if(Play.current.configuration.getBoolean("securesocial.registrationEnabled").getOrElse(true) )/*52.120*/{_display_(Seq[Any](format.raw/*52.121*/("""
                             <div class="clearfix">
                                 <p>"""),_display_(Seq[Any](/*54.38*/Messages("securesocial.login.signUp"))),format.raw/*54.75*/(""" <a href=""""),_display_(Seq[Any](/*54.86*/securesocial/*54.98*/.core.providers.utils.RoutesHelper.startSignUp())),format.raw/*54.146*/("""">"""),_display_(Seq[Any](/*54.149*/Messages("securesocial.login.here"))),format.raw/*54.184*/("""</a></p>
                              </div>
                            """)))})),format.raw/*56.30*/("""
                    </fieldset>
                </form>
            """)))})),format.raw/*59.14*/("""
""")))}/*60.2*/.getOrElse/*60.12*/ {_display_(Seq[Any](format.raw/*60.14*/("""
    """),format.raw/*63.48*/("""
    """),_display_(Seq[Any](/*64.6*/Logger/*64.12*/.error("[securesocial] unknown provider '%s'. Can't render it.".format(providerId)))),format.raw/*64.95*/("""
    """),format.raw/*65.5*/("""{"""),format.raw/*65.6*/(""" throw new RuntimeException("Unknown provider '%s') """),format.raw/*65.58*/("""}"""),format.raw/*65.59*/("""
""")))})),format.raw/*66.2*/("""
"""))}
    }
    
    def render(providerId:String,loginForm:Option[Form[scala.Tuple2[String, String]]],request:RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(providerId,loginForm)(request)
    
    def f:((String,Option[Form[scala.Tuple2[String, String]]]) => (RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (providerId,loginForm) => (request) => apply(providerId,loginForm)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:25 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/provider.scala.html
                    HASH: 6287a345f7ae99735f698b29d12454ef09bd4f67
                    MATRIX: 629->1|1132->422|1165->446|1269->104|1298->420|1327->519|1365->522|1382->530|1421->560|1473->574|1523->588|1600->656|1640->658|1694->676|1773->746|1826->760|1893->791|1910->799|1950->817|2000->831|2021->843|2056->856|2113->881|2159->895|2210->910|2260->951|2300->953|2370->987|2391->999|2520->1105|2695->1244|2754->1294|2794->1296|2860->1326|2875->1332|3139->1574|3184->1601|3197->1606|3236->1607|3302->1637|3317->1643|3579->1883|3637->1909|3700->1936|3715->1942|3968->2173|4132->2301|4191->2337|4353->2463|4374->2475|4452->2530|4495->2536|4563->2581|4665->2647|4769->2741|4809->2742|4935->2832|4994->2869|5041->2880|5062->2892|5133->2940|5173->2943|5231->2978|5338->3053|5440->3123|5460->3125|5479->3135|5519->3137|5552->3300|5593->3306|5608->3312|5713->3395|5745->3400|5773->3401|5853->3453|5882->3454|5915->3456
                    LINES: 19->1|36->12|36->12|37->1|39->11|40->12|42->14|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|45->17|45->17|45->17|46->18|47->19|49->21|49->21|49->21|50->22|50->22|50->22|54->26|54->26|54->26|55->27|55->27|59->31|60->32|60->32|60->32|61->33|61->33|65->37|66->38|68->40|68->40|72->44|75->47|75->47|78->50|78->50|78->50|78->50|78->50|80->52|80->52|80->52|82->54|82->54|82->54|82->54|82->54|82->54|82->54|84->56|87->59|88->60|88->60|88->60|89->63|90->64|90->64|90->64|91->65|91->65|91->65|91->65|92->66
                    -- GENERATED --
                */
            