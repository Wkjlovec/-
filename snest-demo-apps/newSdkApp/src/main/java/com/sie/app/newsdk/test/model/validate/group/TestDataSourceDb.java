package com.sie.app.newsdk.test.model.validate.group;

import com.sie.snest.sdk.BaseModel;
import com.sie.snest.sdk.annotation.meta.Model;
import com.sie.snest.sdk.annotation.meta.Property;
import com.sie.snest.sdk.annotation.validate.Validate;

@Model(name = "TestDataSource", parent = "TestDataSource")
public class TestDataSourceDb extends BaseModel<TestDataSourceDb> {

    @Validate.NotBlank(groups = TestDataSource.Db.class)
    @Property(columnName = "host", displayName = "连接地址")
    private String host;

    @Validate.NotBlank(groups = TestDataSource.Db.class)
    @Property(columnName = "user", displayName = "用户名")
    private String user;

    @Validate.NotBlank(groups = TestDataSource.Db.class)
    @Property(columnName = "password", displayName = "密码")
    private String password;
}