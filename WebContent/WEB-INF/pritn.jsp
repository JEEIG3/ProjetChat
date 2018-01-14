<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<fieldset>
		<pr>
		<h3>
			Si vous souhaitez envoyer un message a un membre, veuillez<br>
			entrer son nom dans le champ suivant, ou si un message est adresse a<br>
			tout le monde, entrez le mot "groupe" au lieu du nom du destinataire
		</h3>
		<br>
	</fieldset>
	<form action="servlteMessage" method="post">
		<fieldset>
			<legend>
				<h1>Chat:</h1>
				
			</legend>
			<br> Nom de l'expediteur:<br> <input type="text"
				name="expediteur" value="" size="50"><br> <br> Le
			nom du destinataire:<br> <input type="text" name="destinataire"
				value="" size="50"><br> <br>
			<TEXTAREA name="message" rows=5 cols=50>Entrez voutre message</TEXTAREA>
			<br> <br> <input type="submit" value="Envoyer">

		</fieldset>
	</form>
	
	
</body>
</html>