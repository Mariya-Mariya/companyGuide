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
    <h2>List Department</h2>
    <div class="tab elastic">
        <#list departments as department>
            <#if department?index == 0>
                <button class="tablinks active"
                        onclick="openItem(event, '${department.departmentCode}')">${department.departmentName}</button>
            <#else>
                <button class="tablinks"
                        onclick="openItem(event, '${department.departmentCode}')">${department.departmentName}</button>
            </#if>
        </#list>
    </div>
    <#list departments as department>
        <#if department?index == 0>
            <div id="${department.departmentCode}" class="tabcontent">
                <h3>Code department ${department.departmentCode}</h3>
                <p>Name ${department.departmentName}</p>
                <p>Department Head ${department.departmentHead}</p>
                <p><input name="showEmployees" value="Show list of employees" type="button" onclick="showEmployees(${department.departmentCode})"/> </p>
            </div>
        <#else>
            <div id="${department.departmentCode}" class="tabcontent" style="display: none">

                <h3>Code department ${department.departmentCode}</h3>
                <p>Name ${department.departmentName}</p>
                <p>Department Head ${department.departmentHead}</p>
                <p><input name="showEmployees" value="Show list of employees" type="button" onclick="showEmployees(${department.departmentCode})"/> </p>

            </div>
        </#if>
    </#list>



</div>

</body>
</html>