<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts dispatch action</title>
</head>
<body>


            <table>
                <tr>
                    <td>
                        <bean:write name="UserForm" property="message" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <a href="UserAction.do?method=add">Add </a>
                    </td>
                </tr>
                <tr>
                    <td>
                       <a href="UserAction.do?method=update">update</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <a href="UserAction.do?method=delete"> delete</a>
                    </td>
                </tr>
            </table>

</body>
</html>