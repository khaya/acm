<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">


<head>
    <title>JBoss - Global Leader in Open Source Middleware Software</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type"/>
    <meta content="en" http-equiv="Content-Language"/>
    <meta content="0" http-equiv="expires"/>
    
    
    <meta content="INDEX,FOLLOW" name="ROBOTS"/>
    <meta content="document" name="resource-type"/>
    <meta content="The Professional Open Source Company" name="author"/>
    <meta content="Copyright (c) 2004 by JBoss.com" name="copyright"/>
    <meta content="1 days" name="revisit-after"/>
    <meta content="Global" name="distribution"/>
    <meta content="Nukes on JBoss - http://www.jboss.org" name="generator"/>
    <meta content="General" name="rating"/>
    
    <link rel="shortcut icon" href="/images/favicon.ico"/>
    <link rel="icon" href="/images/favicon.png" type="image/png" />
    <link href="https://www.redhat.com/s/promoFlipper.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="/css/reset.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="/css/nav.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="/css/com_main.css" rel="stylesheet" type="text/css" />
    <link href="/css/lists.css" rel="stylesheet" type="text/css" />
    <link href="/css/tables.css" rel="stylesheet" type="text/css" />
    <!--[if IE]>     
    <link href="css/iehacks.css" rel="stylesheet" type="text/css"  />   
    <![endif]--> 

    <script type="text/javascript" src="/js/jquery-1.2.6.min.js"></script>
    <script type="text/javascript" src="/js/hoverIntent.js"></script>
    <script type="text/javascript" src="/js/superfish.js"></script>
    <script type='text/javascript' src='/js/menu.js'>
    </script><script type="text/javascript" src="https://www.redhat.com/j/lib/jquery/plugins/jquery.easing.1.3.js"></script>
	<script type="text/javascript" src="https://www.redhat.com/j/lib/jquery/plugins/jquery.cycle.min.js"></script>

    <script type="text/javascript">        
        // initialise plugins
        jQuery(function(){
            jQuery('ul.sf-menu').superfish();
        });
    </script>
    
    <!--why is the following NOT WORKING to hide >> ? -->
    <script type="text/javascript"> 
      // initialise Superfish 
      $(document).ready(function() { 
        $('ul.sf-menu').superfish({ 
          delay:       500,                            // one second delay on mouseout 
          animation:   {opacity:'show',height:'show'},  // fade-in and slide-down animation 
          speed:       'fast',                          // faster animation speed 
          autoArrows:  false,                           // disable generation of arrow mark-up 
          dropShadows: false                            // disable drop shadows 
        }); 
      }); 
    </script>
    
    <script type="text/javascript" src="https://www.redhat.com/j/jquery_rh/promoFlipper_cycle_jquery.js"> </script>


</head>

<body>
  <div id="container">
    <div id="COMheader">
      <div id="COMlogo"><a href="/"><img src="/images/common/jbosscorp_logo.png" alt="JBoss.org home" /></a></div>
    	
      <!-- Utility controls -->
      <div id='utilitynav' style="vertical-align: top">
        <form class="nomargin" id="TopSearch" action="" onsubmit="" method="get" >
          <input type="hidden" id="searchArea" name="searchArea" value="" />
          <input type="hidden" id="as_sitesearch" name="as_sitesearch" value="jboss.org" />
          <ul>
<!--            <li id="storelink"><a href="http://www.cafepress.com/jbossorg">Geographies <img src="/images/common/map.png" width="41" height="18" alt="map" /></a> | </li>-->
            <li><a href="https://inquiries.jboss.com/go/redhat/jboss-contact-sales">Contact Sales</a> | </li>
            <li><a href="https://network.jboss.com/jbossnetwork/login.html">Customer Support Portal</a></li>
<!--            <li id="search-field">
              <input 
                class="textinput"
                id="q" 
                name="q" 
                type="text" 
                onfocus="if(this.value==this.defaultValue) this.value='';"
                onBlur="this.value= (this.value=='') ? 'Search the JBoss.com site' : (this.value; setSelected();)" 
                value="Search" 
                onKeyDown="submitonEnter(event);"
              />
                    
              <input  type="image" value="go" src="/images/common/searcharrow.png"  />
            </li>-->
          </ul>
        </form>
      </div>
    
      <!-- Primary Navigation  THIS IS THE SUPERFISH (example) MENU-->
      <div id="primarynav">    
        <ul class="sf-menu">
          <li>
            <a href="/about/" class="menu-title">About</a>
            <ul>
  <li><a href='/about/news'>News</a></li>
  <li><a href='/about/articles'>Coverage</a></li>
  <li><a href='http://blogs.jboss.com/blog/default'>Blogs: Enter the JBoss Matrix</a></li>
  <li><a href='/about/whitepapers/'>Resource Center</a></li>
  <li><a href='/services/online_education'>Webinars &amp; Online Education</a></li>
  <li><a href='/events/'>Events</a></li>
  <li><a href='/about/leadership/'>Industry Leadership</a></li>
  <li><a href='http://investors.redhat.com/phoenix.zhtml?c=67156&amp;p=irol-irhome'>Investor Relations</a></li>
  <li><a href='http://www.redhat.com/about/companyprofile/management/'>Management Team</a></li> 
  <li><a href='http://www.redhat.com/about/careers/'>Careers</a></li>
</ul>

          </li>
          <li>
            <a href='/resources/' class="menu-title">Solutions</a>
            <ul>

<!-- <li><a href="">Application Development, Deployment & Management</a></li>
     <li><a href="">Business Process Automation</a></li>
     <li><a href="">Data Integration and Management</a></li>-->
	
	<li><a href="/resources/soa">SOA Resource Center</a></li> 
	<li class="lastli"><a href="/solutions/javaapps/">Java Applications</a></li>
</ul>

          </li>
          <li>
            <a href="/products/" class="menu-title">Products</a>
            <ul>
	<li><span><a href="/downloads/" style="font-weight:bold;">Downloads</a></span></li>
	<li><strong>Enterprise Platforms</strong></li>
	<li><a href="/products/platforms/application"> &raquo; Application Platform</a></li>
	<li><a href="/products/platforms/webplatform"> &raquo; Web Platform</a></li>
	<li><a href="/products/platforms/webserver"> &raquo; Web Server </a></li>
	<li><a href="/products/platforms/communications"> &raquo; Communications Platform</a></li>
	<li><a href="/products/platforms/portals"> &raquo; Portal Platform</a></li>
	<li><a href="/products/platforms/soa"> &raquo; SOA Platform</a></li>
	<li><a href="/products/platforms/brms"> &raquo; Business Rules Management System</a></li> 
	<li><a href="/products/platforms/dataservices"> &raquo; Data Services Platform</a></li>
	
	<li><strong>Enterprise Frameworks</strong></li>
	<li><a href="/products/hibernate"> &raquo; JBoss Hibernate</a></li>
	<li><a href="/products/seam"> &raquo; JBoss Seam</a></li>
	<li><a href="/products/wfk"> &raquo; JBoss Web Framework Kit</a></li>
	<li><a href="/products/jbpm"> &raquo; JBoss jBPM</a></li>
	
	<li><strong>Management</strong></li>
	<li><a href="/products/jbosson"> &raquo; Operations Network</a></li>

	<li><strong>Development Tools</strong></li>
	<li class="lastli"><a href="/products/devstudio"> &raquo; Developer Studio</a></li>
</ul>

          </li>
          <li>
            <a href="/services/" class="menu-title">Services</a>
                  <ul>
        <li><a href="/services/">Enterprise Services</a></li>
        <li><a href="/services/subscriptions/">Subscriptions and Support</a></li>
<!--        <li><a href="/products/subscriptions">JBoss Enterprise Subscription</a></li>-->
        <li><a href="/services/consulting/">Consulting</a></li>
        <li><a href="/services/training/">Training</a></li>
        <li class='lastli'><a href="https://network.jboss.com/jbossnetwork/login.html">JBoss Enterprise Support Customer Login</a></li>
      </ul>

          </li>
          <li>
            <a href="/developers/" class="menu-title">Developers</a>
                  <ul>
        <li><a href='/downloads/'>Downloads</a></li>
        <li><a href='https://www.redhat.com/developers/subscriptions.html'>Enterprise Developer Subscriptions</a></li>
        <li><a href='/products/devstudio'>JBoss Developer Studio</a></li>
        <li><a href='http://www.dzone.com/mz/jboss'>JBoss Microzone on DZone</a></li>
        <li><a href='/services/online_education/'>Online Education</a></li>
        
        <li><a href='/events/'>Events &amp; User Groups</a></li>
        <li><a href='/products/community-enterprise'>JBoss Community</a></li>
        <li><a href='http://www.redhat.com/developers/partners/exadel/'>Exadel Web 2.0 Center of Excellence</a></li>
        <li class='lastli'><a href="https://inquiries.jboss.com/go/redhat/businessnews">JBoss Developer Newsletter</a></li>
        <li><span><strong>DZone JBoss RefCardZ</strong></span></li> 
	<li><a href="http://refcardz.dzone.com/refcardz/javaserver-faces-20"> &raquo; JavaServer Faces 2.0</a></li>
	<li><a href="http://refcardz.dzone.com/refcardz/richfaces?oid=ban00021-0"> &raquo; JBoss RichFaces</a></li>
	<li><a href="http://refcardz.dzone.com/refcardz/core-seam"> &raquo; Core Seam</a></li>
	<li><a href="http://refcardz.dzone.com/refcardz/seam-ui"> &raquo; Seam UI</a></li>
	<li><a href="http://refcardz.dzone.com/announcements/hibernate-search"> &raquo; Hibernate Search</a></li>
      </ul>

          </li>
          <li>
            <a href="/customers/" class="menu-title">Customers</a>
            
          </li>
          <li class="lasttab">
            <a href="/partners/" class="menu-title">Partners</a>
            <ul>
  <li><a href="/partners/become-a-jboss-certified-ISV">Become an ISV Partner</a></li>
  <li><a href="/partners/become-a-jboss-solution-partner">Become a Solution Partner</a></li>
  <li><a href="/partners/isv">Find an ISV Partner</a></li>
  <li class='lastli'><a href="/partners/solution">Find a Solution Partner</a></li>
</ul>

          </li>
        </ul>
      </div>
    </div>
    <!-- ORGheader end -->

    <!-- Page Content -->
    <div id="contentcontainer">

<script type="text/javascript" src="/js/rotate.js"></script>

<div id="homecontent">
	<div id="banner-graphic">
	
		<div id="corp-advert">
		  <h1>
		    JBoss is the global leader in open source enterprise class service oriented architecture (SOA) and middleware.
		  </h1>
		</div>
	
		<div id="corp-tagline">
			<div id="newPromoHome">
				<div id="newPromoSlides" class="promoPics">
					<a href="http://www.jboss.com/promo/JEAPWebinarSeries2010" title="JBoss Webinar Series"><img src="/images/promos/JB_WebinarSeries/JB_WebinarSeriesA_hmpg_promo.png" alt="JBoss Webinar Series" /></a>
					<a href="http://www.jboss.com/pdf/customer_satisfaction.pdf" title="JBoss ranks #1 in support"><img src="/images/promos/JB_1inSupport/JB_1inSupport_promo.png" alt="JBoss ranks #1 in support" /></a>
					<a href="http://www.jboss.com/products/platforms/application/" title="JBoss Enterprise Application Platform 5.0"><img src="/images/promos/JB_EAP5/JB_EAP5_promo.png" alt="JBoss Enterprise Application Platform 5.0" /></a>
				</div>
				
				<ul id="newPromoNav">
					<li id="newPromoOne"><a href="http://www.jboss.com/promo/JEAPWebinarSeries2010/" title="JBoss Webinar Series"><img src="/images/promos/JB_WebinarSeries/JB_WebinarSeriesA_hmpg_tabA.png" alt="JBoss Webinar Series" /></a></li>
					<li id="newPromoTwo"><a href="http://www.jboss.com/pdf/customer_satisfaction.pdf" title="JBoss ranks #1 in support"><img src="/images/promos/JB_1inSupport/JB_1inSupport_tabB.png" alt="JBoss ranks #1 in support" /></a></li>
					<li id="newPromoThree"><a href="http://www.jboss.com/products/platforms/application/" title="JBoss Enterprise Application Platform 5.0"><img src="/images/promos/JB_EAP5/JB_EAP5_tabC.png" alt="JBoss Enterprise Application Platform 5.0" /></a></li>
				</ul>
				<a href="#" class="SPButtonNonJS">Stop</a>
			</div>
		</div>
	</div>
        
	<div id="spotlight-content">
	
		<div id="Partners">

   <div style="position:relative"> 
	<div class="Partners-spotlight" style="background:url('/images/promos/jeap-spotlight.png')"> 
	 <a href="/products/platforms/application/" style="width:100%;height:100%;text-decoration:none;display:block">&nbsp;</a> 
	</div>
   </div>
   	
   <div style="position:relative"> 
	<div class="Partners-spotlight"> 
	 <p> <a href="/customers/">See how PNC carved costs</a></p>
	</div>
	<div class="newsletter"> 
	 <p> <a class="event-date" href="https://inquiries.jboss.com/go/redhat/businessnews">Subscribe 
	  to JBoss Newsletters</a> </p>
	</div>
   </div>
		</div>
	
		<div id="Homepage-Items">
		
			<div class="hpCol" id="hpCol1">
				<h3>Resources</h3>
				<div class="news-item">
					<a href="https://inquiries.redhat.com/go/redhat/forrester">Forrester TEI Study</a>
				</div>

				<div class="news-item">
				       <a href="https://inquiries.redhat.com/go/redhat/gartner">Gartner Magic Quadrant for Enterprise Application Servers</a>
			        </div>
			
			    <div class="news-item">
				   <a href="http://www.jboss.com/solutions/javaapps/">JBoss Open Choice Video</a>
			    </div>
			
				<div class="news-item">
				   <a href="http://www.jboss.com/pdf/JBossEnterpriseMiddlewareBrochure.pdf">JBoss Enterprise Middleware &amp; Subscriptions Brochure</a>
				</div>
				
				<div class="news-item">
				   <a href="http://www.jboss.com/pdf/customer_satisfaction.pdf">Velociti Partners: JBoss Customer Satisfaction Study</a>
				</div>
			
				<div class="more-items">
				   <a href="/about/whitepapers/">More Resources</a>
				</div>
			</div>
		    <!--start Zift-->
			<script type='text/javascript' src='http://widgets.ziftsolutions.com/redhat.ziftsolutions.com/js/8a7c9fef2353adc501235c8f063c2861' ></script>
			<!--end Zift-->
		</div>
	
	</div>
	<div class="clearfix"> </div>
</div>
      <script type="text/JavaScript">setPage('leftcol')</script>
      <script type="text/JavaScript">setPage()</script>
    	<div class="footer">
        <p> 
          <a href="http://www.redhat.com/">Red Hat</a> 
          <a href="http://www.redhat.com/about/contact/dir/">Contact Us</a>
          <a href="https://www.redhat.com/legal/privacy_statement.html">Privacy Policy</a> &copy; 2009 Red Hat Middleware, LLC.  All rights reserved
          <a class="corplogo" href="http://www.redhat.com/"><img src="/images/common/redhat_logo-lg.png" alt="Red Hat" /></a>  
        </p>   
      </div>

      <script id="m2lwst" src="https://inquiries.redhat.com/wt/m2lwst.js"></script>
      <script language="javascript">
        _m2lTracker.tenantId ='108';
        _m2lTracker.tenantCode ='redhat';
        _m2lTracker.category['2']='jboss.com';
        _m2lTracker.track();
      </script> 

      <!-- SiteCatalyst code version: H.1.
           Copyright 1997-2005 Omniture, Inc. More info available at
           http://www.omniture.com sec -->
      <div id="oTags">
        <script type="text/javascript" src="http://www.redhat.com/j/s_code.js"></script>
        <script><!--
          /* You may give each page an identifying name, server, and channel on
             the next lines. */
          s.pageName="" 
          s.server=""
          s.channel=""
          s.pageType=""
          s.prop1=""
          /* E-commerce Variables */
          s.campaign=""
          s.eVar1=""
          s.eVar2=""
          s.eVar3=""
          s.events=""
          s.products=""
          s.state=""
          s.zip=""
          s.purchaseID=""


          /************* DO NOT ALTER ANYTHING BELOW THIS LINE ! **************/
          var s_code=s.t();if(s_code)document.write(s_code)//--></script> 

        <script type="text/javascript"><!--
          if(navigator.appVersion.indexOf('MSIE')>=0)document.write(unescape('%3C')+'\!-'+'-')
        //--></script><noscript><img
           src="https://smtrcs.redhat.com/b/ss/redhatjboss,redhatglobal/1/H.2--NS/0"
           height="1" width="1" border="0" alt="" /></noscript><!--/DO NOT REMOVE/-->
           </div>
		   
		   <script type="text/javascript">var domainy = location.protocol == "https:" ? "https://leads.demandbase.com" : "http://leads.demandbase.com"; document.write(unescape("%3Cscript src='" + domainy +"/150886.js' type='text/javascript'%3E%3C/script%3E"));</script><noscript><p><img alt="Demandbase Connect" src="http://leads.demandbase.com/150886-db5.gif" /></p></noscript><noscript><p><img src="http://www.demandbase.com/images/stream/demandbase.gif" alt="Demandbase" /></p></noscript>

           <!-- End SiteCatalyst code version: H.1. -->
	</div>
</div>

</body>
</html>

