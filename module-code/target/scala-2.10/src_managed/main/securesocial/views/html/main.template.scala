
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import securesocial.core.providers.utils.RoutesHelper


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*8.17*/title)),format.raw/*8.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/RoutesHelper/*9.66*/.bootstrapCssPath)),format.raw/*9.83*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/RoutesHelper/*10.71*/.faviconPath)),format.raw/*10.83*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/RoutesHelper/*11.66*/.customCssPath.getOrElse(""))),format.raw/*11.94*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/RoutesHelper/*12.35*/.jqueryPath)),format.raw/*12.46*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <span class="brand" >"""),_display_(Seq[Any](/*18.43*/Messages("securesocial.appName"))),format.raw/*18.75*/("""</span>
                </div>
            </div>
        </div>

        <div class="container" style="padding-top:30px">
            """),_display_(Seq[Any](/*24.14*/content)),format.raw/*24.21*/("""
        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:25 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/main.scala.html
                    HASH: a28b8016ad5dcddb9ae04a08da98217367599502
                    MATRIX: 573->1|751->31|779->88|865->139|891->144|988->206|1008->218|1046->235|1143->296|1164->308|1198->320|1290->376|1311->388|1361->416|1422->441|1443->453|1476->464|1737->689|1791->721|1963->857|1992->864
                    LINES: 19->1|23->1|25->4|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|39->18|39->18|45->24|45->24
                    -- GENERATED --
                */
            