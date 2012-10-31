<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>Twacker Results Page</title>
    <script type="text/javascript" src="http://www.google.com/jsapi"></script>
    <script type="text/javascript">
      google.load('visualization', '1', {packages: ['corechart']});
    </script>
    <script type="text/javascript">
      	function drawVisualization() {
    	var theString = new String("[17228, 5701, 6553, 4523, 4041, 2755, 9179, 5575, 5053, 6554]");
    	var length = theString.length;
    	theString = theString.substring(1,length-1);
    	
    	var stringArr = theString.split(",");
    	
    	var testArr = [['Day', 'Search Term']];
    	for (var i=0;i<stringArr.length;i++) {
    		testArr.push([String.fromCharCode(97 + i), parseInt(stringArr[i],10)]);
    	}
    	
    	// Create and populate the data table.
        var data = google.visualization.arrayToDataTable(testArr);
      
     	// Set chart options
     	var options = {'title':'Tweet Frequency over the Last 10 Days', 'curveType': 'none'};
     	
        // Create and draw the visualization.
        new google.visualization.LineChart(document.getElementById('visualization')).draw(data, options);
      }     

      google.setOnLoadCallback(drawVisualization);
    </script>
  </head>
  <body style="font-family: Arial;border: 0 none;">
      <p>You searched for ${twackerBean.query}.</p>
    <div id="visualization" style="width: 600px; height: 600px;"></div>
  </body>
</html>
​