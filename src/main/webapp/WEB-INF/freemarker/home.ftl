	
	<html>
	<head><title>Picaso Home Page</title></head>
	<body>
	
	<ul>
	<#list listAlbum as key>
	<li>
	<b>${key.albumName}</b> <b>$(key.creationDate)</b>
	</li>
	</ul>
	
	</body>
	</html>
