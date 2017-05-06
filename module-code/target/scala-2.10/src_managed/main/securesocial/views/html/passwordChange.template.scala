
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
object passwordChange extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[securesocial.controllers.PasswordChange.ChangeInfo],RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(passwordChangeForm:Form[securesocial.controllers.PasswordChange.ChangeInfo])(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import securesocial.core.providers.UsernamePasswordProvider

import securesocial.core.IdentityProvider

import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(securesocial.views.html.inputFieldConstructor.f) }};
Seq[Any](format.raw/*1.112*/("""
"""),format.raw/*5.99*/("""

"""),_display_(Seq[Any](/*7.2*/securesocial/*7.14*/.views.html.main( Messages("securesocial.passwordChange.title") )/*7.79*/ {_display_(Seq[Any](format.raw/*7.81*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*9.14*/Messages("securesocial.passwordChange.title"))),format.raw/*9.59*/("""</h1>
    </div>

    """),_display_(Seq[Any](/*12.6*/request/*12.13*/.flash.get("error").map/*12.36*/ { msg =>_display_(Seq[Any](format.raw/*12.45*/("""
        <div class="alert alert-error">
            """),_display_(Seq[Any](/*14.14*/msg)),format.raw/*14.17*/("""
        </div>
    """)))})),format.raw/*16.6*/("""

    """),_display_(Seq[Any](/*18.6*/if( request.flash.get("success").isDefined )/*18.50*/ {_display_(Seq[Any](format.raw/*18.52*/("""
        <div class="alert alert-info">
            """),_display_(Seq[Any](/*20.14*/request/*20.21*/.flash.get("success").get)),format.raw/*20.46*/("""
        </div>

        <div class="form-actions">
            <a class="btn" href=""""),_display_(Seq[Any](/*24.35*/securesocial/*24.47*/.controllers.ProviderController.toUrl(request.session))),format.raw/*24.101*/("""">"""),_display_(Seq[Any](/*24.104*/Messages("securesocial.passwordChange.okButton"))),format.raw/*24.152*/("""</a>
        </div>
    """)))}/*26.7*/else/*26.12*/{_display_(Seq[Any](format.raw/*26.13*/("""
        <form action=""""),_display_(Seq[Any](/*27.24*/securesocial/*27.36*/.core.providers.utils.RoutesHelper.handlePasswordChange.absoluteURL(IdentityProvider.sslEnabled))),format.raw/*27.132*/(""""
              class="form-horizontal"
              autocomplete= "off"
              method="POST"
        >
            <fieldset>
                """),_display_(Seq[Any](/*33.18*/helper/*33.24*/.inputPassword(
                    passwordChangeForm("currentPassword"),
                    '_label -> Messages("securesocial.passwordChange.currentPassword"),
                    'class -> "input-xlarge"
                ))),format.raw/*37.18*/("""

                """),_display_(Seq[Any](/*39.18*/helper/*39.24*/.inputPassword(
                    passwordChangeForm("newPassword.password1"),
                    '_label -> Messages("securesocial.passwordChange.newPassword1"),
                    'class -> "input-xlarge"
                ))),format.raw/*43.18*/("""

                """),_display_(Seq[Any](/*45.18*/helper/*45.24*/.inputPassword(
                    passwordChangeForm("newPassword.password2"),
                    '_label -> Messages("securesocial.passwordChange.newPassword2"),
                    '_error -> passwordChangeForm.error("newPassword"),
                    'class -> "input-xlarge"
                ))),format.raw/*50.18*/("""

                <div class="form-actions">
                    <button type="submit" class="btn btn-primary">"""),_display_(Seq[Any](/*53.68*/Messages("securesocial.passwordChange.changeButton"))),format.raw/*53.120*/("""</button>
                    <a class="btn" href=""""),_display_(Seq[Any](/*54.43*/securesocial/*54.55*/.controllers.ProviderController.toUrl(request.session))),format.raw/*54.109*/("""">"""),_display_(Seq[Any](/*54.112*/Messages("securesocial.signup.cancel"))),format.raw/*54.150*/("""</a>
                </div>
            </fieldset>
        </form>
     """)))})),format.raw/*58.7*/("""
""")))})))}
    }
    
    def render(passwordChangeForm:Form[securesocial.controllers.PasswordChange.ChangeInfo],request:RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(passwordChangeForm)(request)
    
    def f:((Form[securesocial.controllers.PasswordChange.ChangeInfo]) => (RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (passwordChangeForm) => (request) => apply(passwordChangeForm)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:25 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/passwordChange.scala.html
                    HASH: d2ffad9a84eac5eb3721566ccdcce94bd71d44ef
                    MATRIX: 642->1|958->234|990->258|1094->111|1122->331|1159->334|1179->346|1252->411|1291->413|1370->457|1436->502|1494->525|1510->532|1542->555|1589->564|1679->618|1704->621|1756->642|1798->649|1851->693|1891->695|1980->748|1996->755|2043->780|2165->866|2186->878|2263->932|2303->935|2374->983|2417->1009|2430->1014|2469->1015|2529->1039|2550->1051|2669->1147|2857->1299|2872->1305|3119->1530|3174->1549|3189->1555|3439->1783|3494->1802|3509->1808|3831->2108|3979->2220|4054->2272|4142->2324|4163->2336|4240->2390|4280->2393|4341->2431|4446->2505
                    LINES: 19->1|26->5|26->5|27->1|28->5|30->7|30->7|30->7|30->7|32->9|32->9|35->12|35->12|35->12|35->12|37->14|37->14|39->16|41->18|41->18|41->18|43->20|43->20|43->20|47->24|47->24|47->24|47->24|47->24|49->26|49->26|49->26|50->27|50->27|50->27|56->33|56->33|60->37|62->39|62->39|66->43|68->45|68->45|73->50|76->53|76->53|77->54|77->54|77->54|77->54|77->54|81->58
                    -- GENERATED --
                */
            