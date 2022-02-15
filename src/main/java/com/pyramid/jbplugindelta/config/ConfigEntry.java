package com.pyramid.jbplugindelta.config;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.util.NlsContexts.ConfigurableName;
import javax.swing.JComponent;
import org.jetbrains.annotations.Nullable;

/**
 * 插件配置
 * <p></p>
 *
 * @author: raymanlei
 * @date: 2022/2/14 14:35
 */
public class ConfigEntry implements Configurable {

    @Override
    public @ConfigurableName String getDisplayName() {
        return null;
    }

    @Override
    public @Nullable JComponent createComponent() {
        return null;
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public void apply() throws ConfigurationException {

    }
}
