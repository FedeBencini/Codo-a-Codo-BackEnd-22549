<%@page import="java.util.List"%>
<%
List<String> errors = (List<String>) request.getAttribute("errors");
List<String> success = (List<String>) request.getAttribute("success");
%>
<%
if ((errors != null && !errors.isEmpty()) || (success != null && !success.isEmpty())) {
%>
<div class="row">
	<div class="col-12">
		<%
		if (errors != null && !errors.isEmpty()) {
		%>
		<div class="alert alert-danger" role="alert">
			<ul>
				<%
					for(String msj : errors){
						out.print("<li>"+msj+"</li>");
					}
				%>
			</ul>
		
		</div>

		<%
		}
		%>
		<%
		if (success != null && !success.isEmpty()) {
		%>
		<div class="alert alert-success" role="alert">
			<ul>
				<%
					for(String msj : success){
						out.print("<li>"+msj+"</li>");
					}
				%>
			</ul>
		
		</div>

		<%
		}
		%>
	</div>
</div>
<%
}
%>