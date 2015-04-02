<%--tiles with menu--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div id="menu">
    <a href="/books/books/up.form"><button>
        <spring:message code="page.menu_books"/>
    </button></a>
    <a href="/categories.form"><button>
        <spring:message code="page.menu_categories"/>
    </button></a>
    <a href="/authors.form"><button>
        <spring:message code="page.menu_authors"/>
    </button></a>
    <a href="/users.form"><button>
        <spring:message code="page.menu_users"/>
    </button></a>
</div>
