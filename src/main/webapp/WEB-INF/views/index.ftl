<!DOCTYPE HTML>
<html>
<head>
    <title>Guide</title>
    <meta charset="utf-8">
    <#include "/library/CSS/style.ftl">
    <#include "/library/CSS/verticalTab.ftl">
    <#include "/library/JS/openEmployee.ftl">
</head>
<body>
<#include "/library/templates/header.ftl">

<div id="left"class="line_block">
    <h2>Search</h2>
    <div>
        <input type="text" id="mySearch" onkeyup="searchItem()" placeholder="Search.." title="Type in a category">
    </div>
</div>


<div id="right" class="line_block">
    <h2>List employees</h2>
    <div class="tab elastic">
        <#list employees as employee>
            <#if employee?index == 0>
                <button class="tablinks active"
                onclick="openItem(event, '${employee.id}')">${employee.firstName} ${employee.middleName} ${employee.lastName}</button>
            <#else>
            <button class="tablinks"
                    onclick="openItem(event, '${employee.id}')">${employee.firstName} ${employee.middleName} ${employee.lastName}</button>
            </#if>
        </#list>
    </div>
    <#list employees as employee>
        <#if employee?index == 0>
        <div id="${employee.id}" class="tabcontent">
            <h3>ID ${employee.id}</h3>
            <p>Code department ${employee.codeDepartment}</p>
            <p>Phone ${employee.phone}</p>
            <p>Email ${employee.email}</p>
        </div>
        <#else>
            <div id="${employee.id}" class="tabcontent" style="display: none">
                <h3>ID ${employee.id}</h3>
                <p>Code department ${employee.codeDepartment}</p>
                <p>Phone ${employee.phone}</p>
                <p>Email ${employee.email}</p>
            </div>
        </#if>
    </#list>
</div>
</body>
</html>