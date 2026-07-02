# NOTICE

## 项目来源

本仓库是 `Tetranomicon` 的 MCCDV NeoForge 1.21.1 迁移分支。

原项目：

- 名称：Tetranomicon
- 原作者：Syric
- 原项目说明：Tetra 材料拓展与兼容数据附属
- 原项目许可证：LGPL-3.0

本仓库包含针对 Minecraft 1.21.1 / NeoForge 21.1.233 / Java 21 的迁移改动。

## 本迁移分支的主要改动

- ForgeGradle -> NeoForge ModDev Gradle。
- Forge 1.20.1 API -> NeoForge 1.21.1 API。
- 物品注册、creative tab 事件、tier 注册等 NeoForge 兼容修正。
- 开发调试类 stub。
- `neoforge.mods.toml`、pack format、构建依赖路径等 GitHub 编译整理。

## 许可证说明

Tetranomicon 本体按 LGPL-3.0 发布，见：

- [LICENSE](./LICENSE)
- [Tetranomicon License.txt](./Tetranomicon%20License.txt)

仓库中少量 Tetra 代码片段按 MIT 协议保留，见：

- [License for Tetra Code](./License%20for%20Tetra%20Code)

## LGPL-3.0 发布注意事项

如果公开发布本迁移分支或构建产物，请注意：

- 保留 LGPL-3.0 许可证文本。
- 保留原作者和本迁移分支的修改说明。
- 发布 jar 时，应提供对应源码，或提供清晰可访问的源码仓库链接。
- 不要将本项目重新声明为 MIT、闭源或其他不兼容许可证。
- 如果仓库额外提交 `libs/` 中的第三方 jar，需要分别保留那些依赖自身的许可证和来源说明。

## 第三方依赖说明

本仓库构建时依赖 Tetra、Mutil、NeoForge、Minecraft 等第三方项目或运行环境。

这些依赖不因本仓库使用 LGPL-3.0 而改变其自身许可证。尤其注意：

- Tetra 相关代码片段按其 MIT 许可证处理。
- Mutil 本地源码中包含 MIT 许可证。
- Minecraft / NeoForge / Curios 等依赖按各自项目许可证和分发规则处理。

## 非官方声明

本迁移分支不是原作者官方版本，也不是 Tetra 官方版本。发布时建议在仓库描述中明确写出“unofficial port / 非官方迁移版”。
