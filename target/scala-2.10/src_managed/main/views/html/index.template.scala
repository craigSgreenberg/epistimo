
package views.html

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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html lang="en" ng-app="myApp">
<head>
    <meta charset="utf-8">
    <title>Epistimo: webfrontend</title>
    <!-- Latest compiled and minified Bootstrap CSS -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
    <link rel="stylesheet" media='screen' href='"""),_display_(Seq[Any](/*9.50*/routes/*9.56*/.Assets.at("stylesheets/main.css"))),format.raw/*9.90*/("""'>
</head>
<body>
<div class="container-fluid col-md-10 col-md-offset-1">
    <!-- Fixed navbar -->
    <header>
        <div class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#/">Epistiomo <i><b>demo</b></i></a>
            </div>
        </div>
    </header>

    <div class="jumbotron">
        <h2>Epistimo: Knowing More So You Can Think Less</h2>
        <p class="pull-right">... an integration excercise using HighchartsJS, AngularJS, Bootstrap, MongoDB</p>
    </div>

    <div id="container" style="width:100%; height:400px;"></div>

    <div ng-view></div>

    <div>
        <footer>
            <hr/>
            <div>
                <span>&copy; Epistimo / IESL / UMass 2012-2014</span>
                <span class="pull-right">version : <span app-version></span></span>
            </div>
        </footer>
    </div>
</div>
</body>

<script src='//ajax.googleapis.com/ajax/libs/angularjs/1.2.13/angular.js' type="text/javascript"></script>
<script src='//ajax.googleapis.com/ajax/libs/angularjs/1.2.13/angular-route.js' type="text/javascript"></script>

<script src='"""),_display_(Seq[Any](/*52.15*/routes/*52.21*/.Assets.at("javascripts/vendor/ui-bootstrap-tpls-0.10.0.js"))),format.raw/*52.81*/("""' type="text/javascript"></script>

<script src='"""),_display_(Seq[Any](/*54.15*/routes/*54.21*/.Assets.at("javascripts/main.js"))),format.raw/*54.54*/("""' type="text/javascript"></script>

<!-- Highcharts resources-->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/highcharts-more.js"></script>
<!-- Highcharts Script-->

<script>
$(function () """),format.raw/*63.15*/("""{"""),format.raw/*63.16*/("""
    $('#container').highcharts("""),format.raw/*64.32*/("""{"""),format.raw/*64.33*/("""

        chart: """),format.raw/*66.16*/("""{"""),format.raw/*66.17*/("""
            type: 'bubble',
            plotBorderWidth: 1,
            zoomType: 'xy'
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/(""",

        title: """),format.raw/*72.16*/("""{"""),format.raw/*72.17*/("""
            text: 'A Plot Using Highcharts'
        """),format.raw/*74.9*/("""}"""),format.raw/*74.10*/(""",

        xAxis: """),format.raw/*76.16*/("""{"""),format.raw/*76.17*/("""
            gridLineWidth: 1
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/(""",

        yAxis: """),format.raw/*80.16*/("""{"""),format.raw/*80.17*/("""
            startOnTick: false,
            endOnTick: false
        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/(""",

        series: ["""),format.raw/*85.18*/("""{"""),format.raw/*85.19*/("""
            data: [
                [9, 81, 63],
                [98, 5, 89],
                [51, 50, 73],
                [41, 22, 14],
                [58, 24, 20],
                [78, 37, 34],
                [55, 56, 53],
                [18, 45, 70],
                [42, 44, 28],
                [3, 52, 59],
                [31, 18, 97],
                [79, 91, 63],
                [93, 23, 23],
                [44, 83, 22]
            ],
            marker: """),format.raw/*102.21*/("""{"""),format.raw/*102.22*/("""
                fillColor: """),format.raw/*103.28*/("""{"""),format.raw/*103.29*/("""
                    radialGradient: """),format.raw/*104.37*/("""{"""),format.raw/*104.38*/(""" cx: 0.4, cy: 0.3, r: 0.7 """),format.raw/*104.64*/("""}"""),format.raw/*104.65*/(""",
                    stops: [
                        [0, 'rgba(255,255,255,0.5)'],
                        [1, Highcharts.Color(Highcharts.getOptions().colors[0]).setOpacity(0.5).get('rgba')]
                    ]
                """),format.raw/*109.17*/("""}"""),format.raw/*109.18*/("""
            """),format.raw/*110.13*/("""}"""),format.raw/*110.14*/("""
        """),format.raw/*111.9*/("""}"""),format.raw/*111.10*/(""", """),format.raw/*111.12*/("""{"""),format.raw/*111.13*/("""
            data: [
                [42, 38, 20],
                [6, 18, 1],
                [1, 93, 55],
                [57, 2, 90],
                [80, 76, 22],
                [11, 74, 96],
                [88, 56, 10],
                [30, 47, 49],
                [57, 62, 98],
                [4, 16, 16],
                [46, 10, 11],
                [22, 87, 89],
                [57, 91, 82],
                [45, 15, 98]
            ],
            marker: """),format.raw/*128.21*/("""{"""),format.raw/*128.22*/("""
                fillColor: """),format.raw/*129.28*/("""{"""),format.raw/*129.29*/("""
                    radialGradient: """),format.raw/*130.37*/("""{"""),format.raw/*130.38*/(""" cx: 0.4, cy: 0.3, r: 0.7 """),format.raw/*130.64*/("""}"""),format.raw/*130.65*/(""",
                    stops: [
                        [0, 'rgba(255,255,255,0.5)'],
                        [1, Highcharts.Color(Highcharts.getOptions().colors[1]).setOpacity(0.5).get('rgba')]
                    ]
                """),format.raw/*135.17*/("""}"""),format.raw/*135.18*/("""
            """),format.raw/*136.13*/("""}"""),format.raw/*136.14*/("""
        """),format.raw/*137.9*/("""}"""),format.raw/*137.10*/("""]

    """),format.raw/*139.5*/("""}"""),format.raw/*139.6*/(""");
"""),format.raw/*140.1*/("""}"""),format.raw/*140.2*/(""");
</script>


<!-- Coffee script compilled resources-->
<script src='"""),_display_(Seq[Any](/*145.15*/routes/*145.21*/.Assets.at("javascripts/app.js"))),format.raw/*145.53*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*146.15*/routes/*146.21*/.Assets.at("javascripts/common/Config.js"))),format.raw/*146.63*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*147.15*/routes/*147.21*/.Assets.at("javascripts/directives/AppVersion.js"))),format.raw/*147.71*/("""' type="text/javascript"></script>

<script src='"""),_display_(Seq[Any](/*149.15*/routes/*149.21*/.Assets.at("javascripts/users/UserService.js"))),format.raw/*149.67*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*150.15*/routes/*150.21*/.Assets.at("javascripts/users/UserCtrl.js"))),format.raw/*150.64*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*151.15*/routes/*151.21*/.Assets.at("javascripts/users/CreateUserCtrl.js"))),format.raw/*151.70*/("""' type="text/javascript"></script>

</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Sep 01 23:21:29 EDT 2014
                    SOURCE: /Users/csgreenberg/c0d3/epistimo_frontend/db-example/app/views/index.scala.html
                    HASH: 3e3a6cb7933a57e827cafe08553049dc336a0ba9
                    MATRIX: 637->0|1104->432|1118->438|1173->472|2756->2019|2771->2025|2853->2085|2939->2135|2954->2141|3009->2174|3375->2512|3404->2513|3464->2545|3493->2546|3538->2563|3567->2564|3690->2660|3719->2661|3765->2679|3794->2680|3874->2733|3903->2734|3949->2752|3978->2753|4043->2791|4072->2792|4118->2810|4147->2811|4244->2881|4273->2882|4321->2902|4350->2903|4851->3375|4881->3376|4938->3404|4968->3405|5034->3442|5064->3443|5119->3469|5149->3470|5410->3702|5440->3703|5482->3716|5512->3717|5549->3726|5579->3727|5610->3729|5640->3730|6139->4200|6169->4201|6226->4229|6256->4230|6322->4267|6352->4268|6407->4294|6437->4295|6698->4527|6728->4528|6770->4541|6800->4542|6837->4551|6867->4552|6902->4559|6931->4560|6962->4563|6991->4564|7099->4635|7115->4641|7170->4673|7256->4722|7272->4728|7337->4770|7423->4819|7439->4825|7512->4875|7599->4925|7615->4931|7684->4977|7770->5026|7786->5032|7852->5075|7938->5124|7954->5130|8026->5179
                    LINES: 22->1|30->9|30->9|30->9|73->52|73->52|73->52|75->54|75->54|75->54|84->63|84->63|85->64|85->64|87->66|87->66|91->70|91->70|93->72|93->72|95->74|95->74|97->76|97->76|99->78|99->78|101->80|101->80|104->83|104->83|106->85|106->85|123->102|123->102|124->103|124->103|125->104|125->104|125->104|125->104|130->109|130->109|131->110|131->110|132->111|132->111|132->111|132->111|149->128|149->128|150->129|150->129|151->130|151->130|151->130|151->130|156->135|156->135|157->136|157->136|158->137|158->137|160->139|160->139|161->140|161->140|166->145|166->145|166->145|167->146|167->146|167->146|168->147|168->147|168->147|170->149|170->149|170->149|171->150|171->150|171->150|172->151|172->151|172->151
                    -- GENERATED --
                */
            