1.Index.html

<!DOCTYPE html>
<html>
<head>
    <title>Frameset Example</title>
</head>
<frameset rows="30%,70%">
    
    <frame src="header.html" name="header" scrolling="no">


    <frameset cols="30%,70%">
     
        <frame src="menu.html" name="menu">

      
        <frame src="content.html" name="content">
    </frameset>
</frameset>
</html>



2.Header.html

<!DOCTYPE html>
<html>
<head>
    <title>Header</title>
</head>
<body style="margin:0; text-align:center;">
    <img src="header-image.jpg" alt="Header Image" style="width:100%; height:100%;">
</body>
</html>


3.Menu.html

<!DOCTYPE html>
<html>
<head>
    <title>Menu</title>
</head>
<body>
    <h3>Menu</h3>
    <ul>
        <li><a href="font.html" target="content">Font</a></li>
        <li><a href="alignment.html" target="content">Alignment</a></li>
    </ul>
</body>
</html>



4.Content.html

<!DOCTYPE html>
<html>
<head>
    <title>Content</title>
</head>
<body>
    <h3>Welcome! Select a menu item to see content.</h3>
</body>
</html>



5.Font.html

<!DOCTYPE html>
<html>
<head>
    <title>Font Page</title>
</head>
<body>
    <h3>Font Examples</h3>
    <p style="font-family:Agency;">Agency</p>
    <p style="font-family:FB;">FB</p>
    <p style="font-family:Grammy;">Grammy</p>
    <p style="font-family:Elephant;">Elephant</p>
    <p style="font-family:Arial;">Arial (default fallback)</p>
</body>
</html>



6.Alignment.html

<!DOCTYPE html>
<html>
<head>
    <title>Alignment Page</title>
</head>
<body>
    <h3>Text Alignment Examples</h3>
    <p style="text-align:left;">Left aligned text</p>
    <p style="text-align:center;">Center aligned text</p>
    <p style="text-align:right;">Right aligned text</p>
    <p style="text-align:justify;">Justified text: Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
</body>
</html>




