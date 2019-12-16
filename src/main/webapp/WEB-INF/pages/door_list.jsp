<%@ page pageEncoding="utf-8"%>
<%-- 引入JSTL标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
<table>
<!-- 模版数据 -->
<c:forEach items="${ doors }" var="door" varStatus="status">
    <tr>
        <td>${ status.count }</td>
        <td>${ door.name }</td>
        <td>${ door.tel }</td>
        <td>${ door.addr }</td>
        <td>
            <a href="doorDelete?id=${ door.id }">删除</a>
            &nbsp;|&nbsp;
            <a href="doorUpdate?id=${ door.id }">修改</a>
        </td>
    </tr>
</c:forEach>
</table>
</table>
</body>
