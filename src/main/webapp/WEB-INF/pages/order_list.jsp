<%@ page pageEncoding="utf-8"%>
<%-- 引入JSTL标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
...
<body>

<table>
<!-- 模版数据 -->
<c:forEach items="${ orders }" var="order"
           varStatus="status">
    <tr>
        <td>${ status.count }</td>

        <!-- 显示订单所属性门店名称 -->
        <c:forEach items="${doorList}" var="door">
            <c:if test="${ door.id==order.doorId }">
                <td class="1111">${ door.name }</td>
            </c:if>
        </c:forEach>

        <td>${ order.orderNo }</td>
        <td>${ order.orderType }</td>
        <td>${ order.pnum }</td>
        <td>${ order.cashier }</td>
        <td>
            <fmt:formatDate value="${ order.orderTime }"
                            pattern="yyyy-MM-dd HH:mm:ss"/>

        </td>
        <td>

            <fmt:formatDate value="${ order.payTime }"
                            pattern="yyyy-MM-dd HH:mm:ss"/>

        </td>
        <td>${ order.payType }</td>
        <td>${ order.price }</td>
        <td>
            <a href="orderDelete?id=${ order.id }">删除</a>
            |
            <a href="orderInfo?id=${ order.id }">修改</a>
        </td>
    </tr>
</c:forEach>

</table>
</body>
