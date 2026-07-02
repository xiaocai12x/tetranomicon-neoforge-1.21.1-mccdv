# 上传到 GitHub 说明

## 推荐仓库名

建议仓库名：

```text
tetranomicon-neoforge-1.21.1-mccdv
```

建议仓库描述：

```text
Unofficial MCCDV NeoForge 1.21.1 port of Tetranomicon, a Tetra material addon.
```

## 上传前检查

上传前建议确认：

- [ ] `README.md` 为中文说明。
- [ ] `LICENSE` 存在，且为 LGPL-3.0 正文。
- [ ] `Tetranomicon License.txt` 保留。
- [ ] `License for Tetra Code` 保留。
- [ ] `NOTICE.md` 已说明原项目、迁移改动、LGPL-3.0、Tetra MIT 片段、第三方依赖与非官方性质。
- [ ] `.github/workflows/build.yml` 存在。
- [ ] 不上传 `.gradle/`、`build/`、`.gradle-user-home*`。
- [ ] 如果上传 `libs/` 中的 Tetra/Mutil jar，需要同时保留对应依赖的许可证和来源说明。

## 使用 GitHub CLI 创建仓库

如果本机已登录 `gh`：

```bash
git init
git add .
git commit -m "Port Tetranomicon to NeoForge 1.21.1"
gh repo create tetranomicon-neoforge-1.21.1-mccdv --public --source . --remote origin --push
```

如果要建私有仓库，将 `--public` 改为 `--private`。

## LGPL-3.0 注意事项

公开发布 jar 时，应同时提供对应源码或清晰的源码仓库链接。不要把本仓库改写成 MIT 或闭源协议。

## 依赖 jar 说明

GitHub Actions 编译前必须能找到：

- `libs/tetra-1.21.1-6.13.0.jar`
- `libs/mutil-1.21.1-6.3.1.jar`

或者修改 workflow，在构建本项目之前先构建/下载 MCCDV 的 Tetra 与 Mutil。
